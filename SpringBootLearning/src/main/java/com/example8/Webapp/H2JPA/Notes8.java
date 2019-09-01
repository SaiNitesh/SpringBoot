package com.example8.Webapp.H2JPA;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestParam;

public class Notes8 {
	
	//@entity, @Id, @EntityScan, @EnableJpaRepositories, @RequestParam

	
	/* Here we are using H2 a In-Memory database
	 * 
	 * few Settings are required for H2 Database in application.properties file
	 * 
	 * Since we are using JPA, we need an annotation @entity in entity class
	 * also we need @Id for unique id in the entity class
	 * 
	 * Adding these two entities will automatically created the table in database
	 * when you run the application.
	 * 
	 * using this URL http://localhost:8080/h2-console, we can check the database and its data
	 * 
	 *  ***Also, data.sql in resources can be used to make changes in database(like dadding, save, updating etc)
	 *  
	 * Spring boot has 'CrudRepository' class which has all the methods for the 
	 * operations on database, like save, adding, updating etc
	 * 
	 * We are using @EntityScan and @EnableJpaRepositories to scan the Entity class and repository Crud interface
	 * in the main class.
	 * 
	 * 
	 * ---------------------------------------------
	 * 
	 * FInal summary
	 * 
	 * main class ->starts apps->creates entity class(@entity) and repo Interface(@autowrire) in conroller
	 * -> hit url -> the view sends the data to controller ->controller saves the data in repository
	 * 
	 * 
	 * we can use crudrespoitory to get the data from DB 
	 * we use @RequestParam to accept the id from UI and get the data from DB using it.
	 * 
	 * using ModeandView to return both Data+view
	 * 
	 * 
	 * 
	 * 
	 * 
	 *  
	 *  */
}
