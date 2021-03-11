package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
	
	@RequestMapping("/greeting")
	public String greeting(
			@RequestParam(value="nombre") String nombre,
			@RequestParam(value="asunto") String asunto,
			@RequestParam(value="anuncio") String anuncio,			
			Model model) {
		
		model.addAttribute("nombre", nombre);
		model.addAttribute("asunto", asunto);
		model.addAttribute("anuncio", anuncio);
		
		return "greeting_template.html";
		
	}
	
}

