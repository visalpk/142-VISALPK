package com.marticus.auth.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marticus.auth.service.Userservice;
import com.marticus.auth.utility.Tokengen;



@RestController
@RequestMapping("/")
public class Authcontroller {
	@Autowired
	Userservice userservice;
	
	@GetMapping("login/{username}/{password}")
  	ResponseEntity<String> login(@PathVariable("username") String username,@PathVariable("password") String password){
            
		String token="Token Not Available";
		Boolean result=userservice.authenticate(username,password);
		if(result) {
		token = Tokengen.getJWTToken();
		}
		
    	return ResponseEntity.ok(token);
  	}
	@GetMapping("log")
	public String log(){
		return "hello";
	}
}
