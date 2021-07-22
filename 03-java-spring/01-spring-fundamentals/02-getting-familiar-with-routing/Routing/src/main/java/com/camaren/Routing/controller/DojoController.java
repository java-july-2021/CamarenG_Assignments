package com.camaren.Routing.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DojoController {
	
	@RequestMapping("/dojo")
	public String dojo() {
		return " The DoJo is Super Awesome!!!";
	}
	
	
	
	
	@RequestMapping("/dojo/{location}")
	public String locations(@PathVariable("location") String locationName) {
		if(locationName.equalsIgnoreCase("Burbank")) {
			return "Burbank Dojo is located in Southern California!";
		}
		else if(locationName.equalsIgnoreCase("San-Jose")) {
			return "SJ dojo is the headquarters!";
		}
		else {
			return " Sorry " + locationName + " is not a valid location";
		}
	}

	
	
}
