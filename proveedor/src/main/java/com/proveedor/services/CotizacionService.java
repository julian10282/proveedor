package com.proveedor.services;

import java.util.HashMap;
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
		Oferta oferta = new Oferta(0, cotizacion.getId(), 360000f, true, 1020750568, "Oferta 1", "Oferta del proveedor 1");
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
}
