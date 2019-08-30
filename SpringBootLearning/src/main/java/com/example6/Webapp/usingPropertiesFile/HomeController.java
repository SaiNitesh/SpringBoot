package com.example6.Webapp.usingPropertiesFile;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	//here we are using the properties file to find the proper view file using prefix and suffix
	//in Properties file.
	@RequestMapping("home4")
	public String home4(){
		System.out.println("hi");
		
		//here it returns the actual JSP page since we added the tomcat-jasper dependency to support
		//JSP files in spring boot 
		return "home";
	}
	
	

}
