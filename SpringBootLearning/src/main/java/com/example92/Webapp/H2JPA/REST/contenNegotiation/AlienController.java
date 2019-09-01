package com.example92.Webapp.H2JPA.REST.contenNegotiation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.common.facades.AlienRepo;
import com.example.common.model.Alien;

@RestController
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@PostMapping(path="/alien", consumes = {"application/json"})
	public Alien addAlienB(@RequestBody Alien alien) {
		
		repo.save(alien);
		
		return alien;
		
	}
	
	//when we use application/x-www-form-urlencoded, Spring doesn't understand it as a RequestBody.
	//So, if we want to use this we must remove the @RequestBody annotation.
	@PostMapping(path="/alien", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public Alien addAlienC(Alien alien) {
		
		repo.save(alien);
		
		return alien;
		
	}
	
	
	@GetMapping(path="/aliens", produces= {"application/xml"})
	//produces restrict the data format the can sent from server
	public List<Alien> aliens() {
		
		return (List<Alien>) repo.findAll();
		
	}
	
	@RequestMapping("/alienData/{id}")
	public Optional<Alien> getAlienData(@PathVariable("id") int id) {
		
		
		return repo.findById(id);
	}
	
	@DeleteMapping("/alienData/{id}")
	public String deleteAlienData(@PathVariable("id") int id) {
		
		Alien a= repo.getOne(id);
		repo.delete(a);
		
		return "deleted";
	}
	
	@PutMapping(path="/alien", consumes = {"application/json"})
	public Alien saveOrUpdateAlien(@RequestBody Alien alien) {
		
		repo.save(alien);
		
		return alien;
		
	}

}
