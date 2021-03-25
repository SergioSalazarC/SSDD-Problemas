package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class TablonAnuncios {
	
	@Autowired
	private AnuncioRepository repAnuncios;
	
	
	@PostConstruct
	public void init() {
		repAnuncios.save(new Anuncio("Pepe","Hola","añlkjfdñsaldkfj"));
	}

	@RequestMapping("/")
	public String controller(Model model) {
			
			model.addAttribute("anuncios",repAnuncios.findAll());
			
			return "index.html";
			
	}
	
	
}
