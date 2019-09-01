package com.example92.Webapp.H2JPA.REST.contenNegotiation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.common.model.Alien;

@Controller
public class AlienViewController {
	
	@RequestMapping("/showAlienView")
	public String getAlien(Alien alien) {
		
		return "showAlien";
		
	}
	
	@RequestMapping("/addAlienView")
	public String addAlien(Alien alien) {
	    return "home3";
		
	}

}
