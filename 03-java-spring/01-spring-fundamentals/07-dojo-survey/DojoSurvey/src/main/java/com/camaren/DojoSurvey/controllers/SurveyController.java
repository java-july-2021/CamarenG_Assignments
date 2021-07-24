package com.camaren.DojoSurvey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SurveyController {

	@RequestMapping("/")
	private String index() {
		return "index.jsp";
	}
	
	
	@RequestMapping(value="/fillOutForm", method=RequestMethod.POST)
	private String processForm(@RequestParam("name") String name, @RequestParam("location") String location, @RequestParam("language") String language, @RequestParam("comments") String comments, Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("location", location);
		model.addAttribute("language", language);
		model.addAttribute("comments", comments);
		
		if(language.equals("Java")) {
			return "javaRespo.jsp";
		}
		
		
		return "showForm.jsp";
	}
	
	
}
