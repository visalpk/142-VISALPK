package com.marticus.customer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marticus.customer.model.Customer;

@RestController
@RequestMapping("/customers")
public class Controller {

@PostMapping("/")
	
ResponseEntity<Void> saveCustomer(@RequestBody Customer cust){
	
	System.out.print(cust.getCustomerCode());
	return ResponseEntity.status(HttpStatus.CREATED)
			 .header("H1", "Value 1")
			 .header("H2", "Value 2")
			 .build();
}

@GetMapping("/")

ResponseEntity<List<Customer>> getAllCustomer(){
	
	List <Customer> custList= new ArrayList<Customer>();
	
	Customer cust1=new Customer(10,"ramesh","9001");
	Customer cust2=new Customer(11,"suresh","9002");
	custList.add(cust1);
	custList.add(cust2);
	
	return ResponseEntity.status(HttpStatus.CREATED).body(custList);
}
}
