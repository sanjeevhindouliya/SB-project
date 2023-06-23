package com.sanjeev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SbProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbProjectApplication.class, args);
		
		
	}
	@GetMapping("/")
	public String welcomeMsg() {
		return "Hello, Wel-come To Gwalior";
	}

}
