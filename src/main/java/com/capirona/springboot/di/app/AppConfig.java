package com.capirona.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.capirona.springboot.di.app.models.domain.ItemFactura;
import com.capirona.springboot.di.app.models.domain.Producto;
import com.capirona.springboot.di.app.models.service.IServicio;
import com.capirona.springboot.di.app.models.service.MiServicio;
import com.capirona.springboot.di.app.models.service.MiServicioComplejo;

@Configuration
public class AppConfig {
	
	@Bean("miServicioSimple")
	public IServicio registrarMiServicio() {
		return new MiServicio();
	}

	@Bean("miServicioComplejo")
	@Primary
	public IServicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}
	
	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems(){
		Producto producto1 = new Producto("Cámara Sony", 100);
		Producto producto2 = new Producto("Bicicleta Trek", 200);
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 4);
		return Arrays.asList(linea1, linea2);
	}

}
