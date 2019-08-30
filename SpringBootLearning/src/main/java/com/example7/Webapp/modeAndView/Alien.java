package com.example7.Webapp.modeAndView;

import org.springframework.stereotype.Component;

//@component tells the spring to register it in spring container and the spring will create an object 
// in container as Alien.class
//So this will make POJO into Spring bean
@Component
public class Alien {
	
	private int id;
	private String name;
	private String tech;
	
	public Alien() {
		super();
		System.out.println("***  object created ***");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	public void show(){
		System.out.println("in show");
	}

}
