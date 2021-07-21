package com.camaren.Strings;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class StringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
	}
	
	@RequestMapping("/")
	public String greeting() {
		return "Hello! its nice to see you";
	}
	
	@RequestMapping("/*")
	public String Random() {
		return " Hello, this is a random page with no usefull info";
	}

}
