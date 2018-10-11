package com.proveedor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proveedor.models.Cotizacion;
import com.proveedor.services.CotizacionService;

@RestController
@RequestMapping("/cotizacion")
public class CotizacionController {
	
	@Autowired
	private CotizacionService cotizacionService;
	
	@PostMapping("/recibir")
	public ResponseEntity<Object> recibir(@RequestBody Cotizacion cotizacion){
		ResponseEntity<Object> responseEntity = cotizacionService.recibirCotizacion(cotizacion);
		
		if (responseEntity.hasBody()) {
			return new ResponseEntity<>(responseEntity.getBody(), HttpStatus.OK);
		}
		return responseEntity;
	}

}
