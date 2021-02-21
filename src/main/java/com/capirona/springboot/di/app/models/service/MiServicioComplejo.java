package com.capirona.springboot.di.app.models.service;


public class MiServicioComplejo implements IServicio{

	@Override
	public String operacion(){
		return "Ejecutando un proceso servicio complejo...";
	}
}
