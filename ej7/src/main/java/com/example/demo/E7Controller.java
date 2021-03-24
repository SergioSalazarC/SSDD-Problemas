package com.example.demo;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class E7Controller {
	
	private List<Anuncio> anuncios = new ArrayList<>();

	@RequestMapping("/")
	public String guardar(@RequestParam(value="enviar", required = false) String enviar, Anuncio anuncio, Model model) {
			if(enviar!= null)
			anuncios.add(anuncio);
			
			model.addAttribute("anuncios",anuncios);
			
			return "index.html";
			
	}
	
	
}
