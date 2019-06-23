package com.lareina.quality.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lareina.quality.model.Prueba;
import com.lareina.quality.repository.PruebaRepository;

@Service
public class PruebaServiceImpl implements PruebaService {
	
	@Autowired
	private PruebaRepository PruebaRepository;

	@Override
	public List<Prueba> getPruebas() {
		return PruebaRepository.findAll();
	}

}
