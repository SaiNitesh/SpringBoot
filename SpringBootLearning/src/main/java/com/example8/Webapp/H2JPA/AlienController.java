package com.example8.Webapp.H2JPA;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.common.facades.AlienRepo;
import com.example.common.model.Alien;

@Controller
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	//http://localhost:8080/home5?name=sai
	@RequestMapping("home8")
	public String home(){
		
		return "home3";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		
		repo.save(alien);
		
		return "home3";
		
	}
	
	
	//FYI: use /addAlien to send the id
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int id) {
		
		//showAlien is an jsp page showAlien.jsp
		ModelAndView mv = new ModelAndView("showAlien");
		Alien alien =  repo.findById(id).orElse(new Alien());
		//here the view should have the same alien object like ${alien}, to show on UI
		mv.addObject(alien);
		
		return mv;
		
	}

}
