package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class TablonAnuncios {
	
	@Autowired
	Anuncios anuncios;
	

	@RequestMapping("/")
	public String controller(Model model) {
			
			model.addAttribute("anuncios",anuncios.getLista());
			
			return "index.html";
			
	}
	
	
}
