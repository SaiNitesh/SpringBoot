package com.example91.Webapp.H2JPA.REST;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.common.facades.AlienRepo;
import com.example.common.model.Alien;

@Controller
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/showAlienView")
	public String addAlien(Alien alien) {
		
		return "showAlien";
		
	}
	
	
	@RequestMapping("/getAliens")
	@ResponseBody
	public String getAliens() {
		
		// when you say return type is String, spring MVC will expect a view like JSP page
		//Thats why we are using @responsebody annotation to take it as DATA instead of view
		return repo.findAll().toString();
		
	}
	
	@RequestMapping("/aliens")
	@ResponseBody
	//springBoot has jackson which is responsible for converting the java object into JSON by default
	public List<Alien> aliens() {
		
		return (List<Alien>) repo.findAll();
		
	}
	
	@RequestMapping("/alien/{id}")
	@ResponseBody
	public String getAlien(@PathVariable("id") int id) {
		
		
		return repo.findById(id).toString();
		
	}
	
	@RequestMapping("/alienData/{id}")
	@ResponseBody
	public Optional<Alien> getAlienData(@PathVariable("id") int id) {
		
		
		return repo.findById(id);
		
	}

}
