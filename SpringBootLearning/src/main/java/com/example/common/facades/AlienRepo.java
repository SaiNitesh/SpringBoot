package com.example.common.facades;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.common.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer> {
	
	Alien findByName(String name);
	
	List<Alien> findByIdGreaterThan(int id);
	
	@Query("from Alien where name=?1 order by id")
	List<Alien> findByNameSorted(String name);
	

}
