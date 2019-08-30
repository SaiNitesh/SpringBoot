package com.example7.Webapp.modeAndView;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyWebAppMVCApplication {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MyWebAppMVCApplication.class, args);
	}

}
