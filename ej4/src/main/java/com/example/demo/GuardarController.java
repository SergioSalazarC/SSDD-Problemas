package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GuardarController {
	
	@RequestMapping("/guardar")
	public String greeting(
			@RequestParam(value="Nombre") String nombre,
			@RequestParam(value="Asunto") String asunto,
			@RequestParam(value="Anuncio") String anuncio,			
			Model model) {
		
		model.addAttribute("nombre", nombre);
		model.addAttribute("asunto", asunto);
		model.addAttribute("anuncio", anuncio);
		
		return "enviar_template.html";
		
	}
	
}

