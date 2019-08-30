package com.example8.Webapp.H2JPA;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	//http://localhost:8080/home5?name=sai
	@RequestMapping("home8")
	public String home(){
		
		return "home3";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		
		return "home3";
		
	}
	

}
