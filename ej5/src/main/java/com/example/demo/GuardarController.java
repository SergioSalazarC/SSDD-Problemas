package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GuardarController {
	
	@RequestMapping("/guardar")
	public String guardar(Anuncio anuncio, Model model) {
		
		model.addAttribute("anuncio",anuncio);
		
		return "enviar_template.html";
		
	}
	
}

