package com.example.EnquiryForm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EnquiryFormApplicationnApplication {
	
	@GetMapping("/")
	public String getMessage() {
		return "welcome to aws";
	}

	public static void main(String[] args) {
		SpringApplication.run(EnquiryFormApplicationnApplication.class, args);
	}

}
