package com.java.Project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.Project.entity.ProEntity;
import com.java.Project.service.ProService;
@RestController
@RequestMapping("/projects")
public class ProController {
	
	@Autowired
	ProService proservice;


	@GetMapping("/")
    public ResponseEntity<List<ProEntity>> getAllProject(){
    	
    	List<ProEntity> pro= proservice.findAllProject();
    	
    	return ResponseEntity.ok(pro);
    }
	@GetMapping("/{id}")
    public ResponseEntity<ProEntity> getProjectById(@PathVariable long id){
    	
    	ProEntity cust= proservice.findProjectsById(id);
    	
    	return ResponseEntity.ok(cust);
    }
}
