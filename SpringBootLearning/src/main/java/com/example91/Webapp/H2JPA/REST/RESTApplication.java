package com.example91.Webapp.H2JPA.REST;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.example.common.model")
@EnableJpaRepositories("com.example.common.facades")
public class RESTApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(RESTApplication.class, args);
	}
}
