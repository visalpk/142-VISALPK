package com.marticus.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marticus.demo.model.Employee;

@RestController
@RequestMapping(path="/emp")
public class EmployeeController {


@PostMapping(path="/getEmployee")
 public ResponseEntity<Employee> getEmployee(@RequestBody String input)
 {
	 
	 System.out.println("input="+input);	
	 Employee emp= new Employee("1","Pushpa");
	 
	 return ResponseEntity.status(HttpStatus.CREATED).header("X-INPUT", input).body(emp);
	   	
	
 }
@PostMapping(path="/getEmployees")
 public ResponseEntity<List<Employee>> getEmployees(@RequestBody String input)
 {
	 
	 List<Employee> lstemp= new ArrayList<Employee>();
	 Employee emp1= new Employee("emp1","Pushpa");
	 Employee emp2= new Employee("emp2","Rocky Bhai");
	 Employee emp3= new Employee("emp3","Vikram");
	 lstemp.add(emp1);
	 lstemp.add(emp2);
	 lstemp.add(emp3);
	 
	 return ResponseEntity.status(HttpStatus.CREATED).header("X-INPUT", input).body(lstemp);
	   	
	
 }
@PostMapping(path="/processEmployees")
 public ResponseEntity<Void> processEmployees(@RequestBody List<Employee> EmployeesList)
 {
	 for(Employee emp:EmployeesList)
	 {
		 System.out.println("EmpID="+emp.getEmpID()+" "+"Name="+emp.getEmpName());
		 
	 }
	
	
 
	 return ResponseEntity.status(HttpStatus.CREATED).header("X-INPUT", "Test").build();
		 
	   	
	
 }
}
