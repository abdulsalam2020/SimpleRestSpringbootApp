package com.abdul.learning.SimpleRestSpringbootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimpleRestSpringbootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleRestSpringbootAppApplication.class, args);
	}
	
	@RequestMapping("/hello")
	public String greeting() {
		return "Hello... Welcome to the Spring Boot Rest Application... :)";
	}

}
