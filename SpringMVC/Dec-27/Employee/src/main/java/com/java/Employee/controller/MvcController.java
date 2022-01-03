package com.java.Employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.Employee.service.EmpService;

@Controller
@RequestMapping("/mvc-controller")
public class MvcController {

	@Autowired
	EmpService empserv;
	
	@GetMapping("/")
	public String getAll(Model model) {
		System.out.println("inside");
		
		return "getEmplist";
	}
}
