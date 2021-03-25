package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MostrarAnuncio {
	
	@Autowired
	private AnuncioRepository repAnuncios;

	@RequestMapping("/MostrarAnuncio")
	public String controller(@RequestParam int id, Model model) {
			model.addAttribute("anuncio",repAnuncios.getOne((long) id));
			
			return "mostrarAnuncio.html";
			
	}
	
	
}

