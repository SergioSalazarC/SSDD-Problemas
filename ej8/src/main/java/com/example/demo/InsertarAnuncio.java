package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class InsertarAnuncio {
	
	@Autowired
	Anuncios anuncios;
	

	@RequestMapping(value="/guardar")
	public String controller(Anuncio anuncio,Model model) {
			
		anuncios.addAnuncio(anuncio);			
		return "mensaje.html";
			
	}
	
	
}
