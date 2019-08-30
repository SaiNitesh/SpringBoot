package com.example7.Webapp.modeAndView;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	//http://localhost:8080/home5?name=sai
	@RequestMapping("home5")
	public ModelAndView home(@RequestParam("name") String myName){
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", myName);
		mv.setViewName("home2");
		
		return mv;
		
	}
	
	//http://localhost:8080/home6?id=1&name=sai&tech=java
	@RequestMapping("home6")
	public ModelAndView home6(Alien alien){
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", alien);
		mv.setViewName("home2");
		
		return mv;
		
	}
	
	
	
	
	

}
