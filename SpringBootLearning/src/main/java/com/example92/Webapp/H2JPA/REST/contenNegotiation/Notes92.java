package com.example92.Webapp.H2JPA.REST.contenNegotiation;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

public class Notes92 {
	
	//@PostMapping, @GetMapping, @RestController, @RequestBody

	
	/* 
	 * Using REST API 
	 * 
	 * new dependency added
	 * jackson-dataformat-xml for supporting XML from server
	 * 
	 * using produces, we can restrict the data format that server can send
	 * 
	 * you can test it by using postman, with below 'header'
	 * accept -> application/xml
	 * 
	 * 
	 *-------------------------------------------------------
	 *
	 *@PostMapping is using for post request
	 *@GetMapping is using for get request
	 *
	 *
	 *if you using REST controller and you DONT want to use @responseBody on methods everytime
	 *just use @RestController instead of @Controller
	 *
	 *
	 * @RequestBody will be used if you want to accept the raw data in server side for POST request 
	 * client -> send the raw data(post request)
	 * 
	 *  
	 *  produces and consumes will be used in server side, 
	 *  produces -> the return/reponse format of server
	 *  consumes -> server accepted data format from client
	 *  
	 *  currently HTML accepts only POST and GET methods like this  method="POST"
	 *  we used  method="POST" in JSP to add the record in DB since default request type is GET
	 *
	 *  
	 *  
	 *  @PutMapping will update the value if available, if not it will create the new value
	 *  
	 *  
	 *  we used AlienViewController.java for JSP views, since @RestController = @controller+@responseBody
	 *  and @ResponseBody will accept only data not views
	 *  
	 *  POst, Put always takes the request DATA from client and returns the reponse DATA
	 *  
	 *  contentNegotiation is the way data will accept from client in a format like json,xml etc.
	 * 
	 * 
	 *  */
}
