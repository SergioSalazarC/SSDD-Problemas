package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {
	
	@RequestMapping("/greeting")
	public String greeting(Model model) {
		
		//En el template (html) donde se indique ${name} en la pagina aparecera World
		model.addAttribute("name", "World");
		
		return "greeting_template";
		
	}
	
}
