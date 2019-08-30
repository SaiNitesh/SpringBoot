package com.example1.SingletonPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SingletonPatternApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SingletonPatternApplication.class, args);
		
		//Manual way to creat an object 
		//Alien a = new Alient();
		//Below code creates the alien object by the spring and we dont need to create manually
		
		//getBean will get the bean the has created by Spring in spring container
		///using @Component annotation in the Alien class.
		// the minute 'run' gets executed, it will register the Alien.class object in Spring container,
		//if you mention @component in the POJO
		Alien1 a =context.getBean(Alien1.class);
		a.show();
		
		//Since the default pattern is singlton,  it will create the object only once
		//you can test below that 'objected created' will execute only once
		
		Alien1 b = context.getBean(Alien1.class);
		b.show();
	}

}
