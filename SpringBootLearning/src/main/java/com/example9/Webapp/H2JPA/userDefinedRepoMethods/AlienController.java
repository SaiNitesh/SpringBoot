package com.example9.Webapp.H2JPA.userDefinedRepoMethods;

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
	
	@RequestMapping("/showAlienView")
	public String addAlien(Alien alien) {
		
		return "showAlien";
		
	}
	
	
	//here we are using custom method to get the Alien based on Name
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int id) {
		
		//showAlien is an jsp page showAlien.jsp
		ModelAndView mv = new ModelAndView("showAlien");
		Alien alien =  repo.findByName("Nitesh");
		//here the view should have the same alien object like ${alien}, to show on UI
		
		System.out.println(repo.findByIdGreaterThan(100));
		System.out.println(repo.findByNameSorted("Nitesh"));
		
		mv.addObject(alien);
		
		return mv;
		
	}

}
