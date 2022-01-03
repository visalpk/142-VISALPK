package com.marticus.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.marticus.demo.model.Student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(path="/hello")
public class HelloWorld {
	
  @GetMapping("/first")
  public String sayHello() {
	  
	  return "Hello World";
	  
  }
  @PostMapping(path="/firststatic")
	 public ResponseEntity<String> save(String input)
	 {
		
		 HttpHeaders header = new HttpHeaders();
	     header.add("header1", "This is my header 1");
	     header.add("header2", "This is my header 2");
	     return ResponseEntity.status(HttpStatus.CREATED).headers(header).body("Hello");
		
		
	 }
	 
	 @PostMapping(path="/object")
	 public ResponseEntity<String> save1(String input)
	 {
		 ResponseEntity<String> res1= new ResponseEntity<>("Hello",HttpStatus.OK);
		 	 
	     return res1;
		
		
	 }
	 
	 @PostMapping(path="/inline")
	 public ResponseEntity<String> save11(String input)
	 {
		 return ResponseEntity.status(HttpStatus.CREATED)
				 .header("H1", "Value 1")
				 .header("H2", "Value 2")
				 .body("Test");
		   	
		
	 }
	 
	 @PostMapping(path="/nobody")
	 public ResponseEntity<Void> save111(String input)
	 {
		 return ResponseEntity.status(HttpStatus.CREATED)
				 .header("H1", "Value 1")
				 .header("H2", "Value 2")
				 .build();
		  	
		
	 }
	 @PostMapping(path="/reqhdr")
	 public ResponseEntity<String> reqhdr(        
			 @RequestHeader(name = "X-COM-PERSIST", required = true) String headerPersist,
             @RequestHeader(name = "X-COM-LOCATION", required = false, defaultValue = "ASIA") String headerLocation,
             @RequestBody String str)
	 {
		 
		 
		 String returnVal="X-COM-PERSIST="+headerPersist+"X-COM-LOCATION="+headerLocation;
		 
		 return ResponseEntity.ok(returnVal);
		  	
		
	 }

  @PostMapping(path="/reshdr")
	 public ResponseEntity<String> reshdr(        
			 @RequestHeader(name = "X-COM-PERSIST", required = true) String headerPersist,
          @RequestHeader(name = "X-COM-LOCATION", required = false, defaultValue = "ASIA") String headerLocation,
          @RequestBody String str)
	 {
		 
		 
		 return ResponseEntity.status(HttpStatus.CREATED)
				 .header("H1", "reshdr 1")
				 .header("H2", "reshdr 2")
                 .body("😎 Response body 🔥");
		  	
		
	 }
  @PostMapping(path="/getStudent")
	 public ResponseEntity<Student> getStudent(@RequestBody String input)
	 {
		 
		 System.out.println("input="+input);	
		 Student st= new Student("st1","Jayanta1");
		 
		 return ResponseEntity.status(HttpStatus.CREATED).header("X-INPUT", input)
			 .body(st);
		   	
		
	 }
  @PostMapping(path="/getStudents")
	 public ResponseEntity<List<Student>> getStudents(@RequestBody String input)
	 {
		 
		 List<Student> lstStu= new ArrayList<Student>();
		 Student st= new Student("st1","Jayanta1");
		 Student st1= new Student("st1","Moumita");
		 Student st11= new Student("st1","Amit");
		 lstStu.add(st);
		 lstStu.add(st1);
		 lstStu.add(st11);
		 
		 return ResponseEntity.status(HttpStatus.CREATED).header("X-INPUT", input)
			 .body(lstStu);
		   	
		
	 }
  @PostMapping(path="/processStudents")
	 public ResponseEntity<Void> processStudents(@RequestBody List<Student> studentList)
	 {
		 for(Student stu:studentList)
		 {
			 System.out.println("Name="+stu.getStuName());
			 
		 }
		
		
	 
		 return ResponseEntity.status(HttpStatus.CREATED).header("X-INPUT", "Test").build();
			 
		   	
		
	 }




  @GetMapping("/pathvar/{id}")
	public int sayHello1(@PathVariable int id)
	{
		
		return id;
		
	}


}
