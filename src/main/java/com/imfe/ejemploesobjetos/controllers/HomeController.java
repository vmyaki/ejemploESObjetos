package com.imfe.ejemploesobjetos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index(Model model) {
		String nombre="Fulanito";
		//Añadimos al modelo,un nuevo objeto, en este caso , el nombre
		model.addAttribute("mensaje", nombre); // mensaje es el identificador de la variable nombre
		return "index";
	}

}
