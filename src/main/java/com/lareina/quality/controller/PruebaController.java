package com.lareina.quality.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lareina.quality.model.Prueba;
import com.lareina.quality.service.PruebaService;

@RestController
public class PruebaController {
	
	@Autowired
	private PruebaService pruebaService;
	
	@GetMapping("/pruebas")
	public ResponseEntity<List<Prueba>> getAllPruebas(){
		
		return new ResponseEntity<List<Prueba>>(pruebaService.getPruebas(),HttpStatus.OK);
	}

}
