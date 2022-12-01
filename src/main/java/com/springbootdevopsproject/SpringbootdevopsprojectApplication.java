package com.springbootdevopsproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootdevopsprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdevopsprojectApplication.class, args);
	}

	@GetMapping("/getMessage")
	public String getMessage() {
		return "Hello docker container is running.";
	}
	
}
