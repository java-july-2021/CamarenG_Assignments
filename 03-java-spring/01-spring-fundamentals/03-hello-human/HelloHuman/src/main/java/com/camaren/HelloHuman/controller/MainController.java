package com.camaren.HelloHuman.controller;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller


public class MainController {
	//included the * to prevent issues if user only enters /user
	@RequestMapping("/*")
	private String index(@RequestParam(value = "q", required = false) String firstName, Model model) {
	model.addAttribute("first", firstName);
	return "index.jsp";
	}
	
	@RequestMapping("/user/{first}")
	public String customGreeting(@PathVariable("first") String firstName, Model model) {
	model.addAttribute("first", firstName);
	return "index.jsp";
	}
	
}






