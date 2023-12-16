package com.example.EnquiryForm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class EnquiryFormApplication {

           @GetMapping("/")
	public String home() {
		return "welcome to aws";
	}

	public static void main(String[] args) {
		SpringApplication.run(EnquiryFormApplication.class, args);
	}

}
