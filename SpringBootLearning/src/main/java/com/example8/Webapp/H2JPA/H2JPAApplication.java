package com.example8.Webapp.H2JPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class H2JPAApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(H2JPAApplication.class, args);
	}
}
