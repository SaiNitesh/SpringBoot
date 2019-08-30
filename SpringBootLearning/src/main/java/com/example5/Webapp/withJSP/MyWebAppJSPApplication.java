package com.example5.Webapp.withJSP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyWebAppJSPApplication {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MyWebAppJSPApplication.class, args);
	}

}
