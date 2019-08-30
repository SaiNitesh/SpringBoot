package com.example5.Webapp.withJSP;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String home(){
		System.out.println("hi");
		
		//here we are returning jsp file but i will download the home.jsp 
		//if you hit this home url  in browser
		return "home.jsp";
	}
	
	
	@RequestMapping("home2")
	@ResponseBody
	public String home2(){
		System.out.println("hi");
		
		//here we are using @responseBody which will return as data and print it on browser
		// like home.jsp as String
		return "home.jsp";
	}
	
	
	@RequestMapping("home3")
	public String home3(){
		System.out.println("hi");
		
		//here it returns the actual JSP page since we added the tomcat-jasper dependency to support
		//JSP files in spring boot 
		return "home.jsp";
	}
	

}
