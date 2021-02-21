package com.capirona.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.capirona.springboot.di.app.models.domain.Factura;

@Controller
@RequestMapping("/factura")
public class FacturaContoller {
	
	@Autowired
	private Factura factura;
	
	@GetMapping("/ver")
	public String index(Model model) {
		model.addAttribute("factura", factura);
		model.addAttribute("titulo", "Ejemplo Factura con DI.");
		return "factura/ver";
	}

}
