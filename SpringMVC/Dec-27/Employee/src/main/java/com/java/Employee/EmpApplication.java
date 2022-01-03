package com.java.Employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class EmpApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate() {return new RestTemplate();}
	@Bean
	public RestTemplate bored() {return new RestTemplate();}
}
