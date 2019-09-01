package com.example93.Webapp.springDataRest;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.common.model.Alien;

//collectionResourceRel is base URL, 
@RepositoryRestResource(collectionResourceRel = "aliens", path = "aliens")
public interface AlienRepoREST extends JpaRepository<Alien, Integer> {
	
	Alien findByName(String name);

}
