package com.lareina.quality.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lareina.quality.model.MateriaPrima;
import com.lareina.quality.repository.MateriaPrimaRepository;

@Service
public class MateriaPrimaServiceImpl implements MateriaPrimaService {
	
	@Autowired
	private MateriaPrimaRepository materiaPrimaRepository;

	@Override
	public List<MateriaPrima> GetRecibos() {
		return materiaPrimaRepository.findAll();
	}

}
