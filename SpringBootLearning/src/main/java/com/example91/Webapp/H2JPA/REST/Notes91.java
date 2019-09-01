package com.example91.Webapp.H2JPA.REST;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

public class Notes91 {
	
	//@ResponseBody, @pathVariable, JPARespository, Optional<>

	
	/* 
	 * Using REST API and JSON
	 * 
	 * @ResponseBody will take what ever DATA the method sends
	 * 
	 * @RequestParam vs @pathVariable
	 * @RequestParam -> is http request parameter which gets assigned when you get the request from a VIEW
	 * like in JSP form and when you click submit button
	 * @pathVariable -> is varaible on URL path like https://localhost:8080/alien/101
	 * here alien is request mapping for method and 101 is the variable on the URL path
	 * 
	 * 
	 * ----------------------------------------------------------------------
	 * 
	 * Another concept of using JSARepository instead of CRUDRepository
	 * JAPRepository extends -> paingAndSortingRepository extends -> CrudRepository
	 * so extedning JSPRepository will automatically extends CrudRepostory
	 * 
	 * also we see optional<Alien> -> which is java8 feature that it returns Alien data if not then it will
	 * send optional data.
	 * 
	 * 
	 *  */
}
