package com.lareina.quality.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="prueba")
public class Prueba {
	
	@Id
	@Column(name = "id_prueba")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "columna1")
	private String columna1;
	
	public Prueba() {
	}

	public Prueba(long id_prueba, String columna1) {
		this.id = id_prueba;
		this.columna1 = columna1;
	}

	public long getId_prueba() {
		return id;
	}

	public void setId_prueba(long id_prueba) {
		this.id = id_prueba;
	}

	public String getColumna1() {
		return columna1;
	}

	public void setColumna1(String columna1) {
		this.columna1 = columna1;
	}

	@Override
	public String toString() {
		return "Prueba [id_prueba=" + id + ", columna1=" + columna1 + "]";
	}
	
	

}
