package com.java.Technology.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.Technology.entity.TechEntity;
import com.java.Technology.service.TechService;

@RestController
@RequestMapping("/tech")
public class TechController {
	@Autowired
	TechService techservice;


	@GetMapping("/")
       public ResponseEntity<List<TechEntity>> getAllTech(){
    	
    	List<TechEntity> tec= techservice.findAllTech();
    	
    	return ResponseEntity.ok(tec);
    }
	@GetMapping("/{id}")
    public ResponseEntity<TechEntity> getProjectById(@PathVariable long id){
    	
    	TechEntity tec= techservice.findtechById(id);
    	
    	return ResponseEntity.ok(tec);
    }
}
