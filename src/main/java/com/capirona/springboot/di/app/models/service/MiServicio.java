package com.capirona.springboot.di.app.models.service;


public class MiServicio implements IServicio{

	@Override
	public String operacion(){
		return "Ejecutando un proceso servicio simple...";
	}
}
