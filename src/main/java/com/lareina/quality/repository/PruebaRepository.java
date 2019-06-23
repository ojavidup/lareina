package com.lareina.quality.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lareina.quality.model.Prueba;

@Repository
public interface PruebaRepository extends JpaRepository<Prueba, Long> {

}
