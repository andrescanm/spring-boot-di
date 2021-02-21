package com.capirona.springboot.di.app.models.domain;

public class Producto {

	private String nonbre;
	private Integer precio;

	public String getNonbre() {
		return nonbre;
	}

	public void setNonbre(String nonbre) {
		this.nonbre = nonbre;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
}