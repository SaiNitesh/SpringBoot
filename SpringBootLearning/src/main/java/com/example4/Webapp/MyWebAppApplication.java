package com.example4.Webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example3.AutowireQualifier.AutowireApplication;

@SpringBootApplication
public class MyWebAppApplication {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MyWebAppApplication.class, args);
	}

}
