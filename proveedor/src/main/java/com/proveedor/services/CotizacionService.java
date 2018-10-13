package com.proveedor.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.proveedor.integration.RestProxy;
import com.proveedor.models.Cotizacion;
import com.proveedor.models.Item;
import com.proveedor.models.Oferta;

@Service
public class CotizacionService {
	
	private static final Log LOG = LogFactory.getLog(CotizacionService.class);
	
	private static final String URL = "http://localhost:8080/ofertas/offer/create";
	
	@Autowired
	@Qualifier("restIntegrationProxy")
	private RestProxy restProxy;
	
	public ResponseEntity<Object> recibirCotizacion(Cotizacion cotizacion) {
		
		LOG.info("Cotizacion recibida ='" + cotizacion.toString()+"'");
		List<Item> items = new ArrayList<>();
		float total = 0;
		if (cotizacion.getItems() != null) {
			for (Item item : items) {
				item.setPrice(generarValorAleatorio());
				items.add(item);
				total += item.getPrice();
			}
		}
		
		Oferta oferta = new Oferta(0, cotizacion.getId(), total, true, 880114561, "Oferta unilago", "Oferta del proveedor de unilago", items);
		
		LOG.info("Oferta enviada ='" + oferta.toString()+"'");
		
		
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
		String json = gson.toJson(oferta);
		
		Map<String, String> headers = new HashMap<>();
		headers.put("Content-Type", "application/json");
		
		ResponseEntity<Object> response = restProxy.sendRequest(RequestMethod.POST, URL, null, null, headers, json);
		
		Oferta result = gson.fromJson(response.getBody().toString(), Oferta.class);
		
		LOG.info("Fin de envio de la oferta ='" + result.toString()+"'");
		return response;
	}
	
	public long generarValorAleatorio() {
		return (long) (Math.random() * 4000000) + 1;
	}
}
