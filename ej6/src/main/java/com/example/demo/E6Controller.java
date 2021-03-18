package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class E6Controller {

	@RequestMapping("enlaces/{num}")
	public String enlaces(
			@PathVariable(value="num") String num, Model model) {
		
		model.addAttribute("num",num);
		
		return "enlaces";
	}
	
	
}
