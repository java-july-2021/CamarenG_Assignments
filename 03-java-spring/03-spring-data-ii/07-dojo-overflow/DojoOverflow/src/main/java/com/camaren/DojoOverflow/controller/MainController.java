package com.camaren.DojoOverflow.controller;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.camaren.DojoOverflow.models.Answer;
import com.camaren.DojoOverflow.models.Question;
import com.camaren.DojoOverflow.services.OverService;
import com.camaren.DojoOverflow.validator.Validator;

@Controller
public class MainController {
	
	@Autowired
	private OverService overService;
	@Autowired
	private Validator validator;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("allQus", this.overService.getQus());
		return "index.jsp";
	}
	
	@GetMapping("/newQuest")
	public String quest(@ModelAttribute("qus") Question question) {
		return "newQuestion.jsp";
	}
	
	@PostMapping("/newQuest")
	public String questAdd(@Valid @ModelAttribute("qus") Question question, BindingResult rslt) {
		validator.validate(question, rslt);
		if(rslt.hasErrors()) {
			return "newQuestion.jsp";
		}
		this.overService.makeQuest(question);
		return "redirect:/newQuest";
	}
	
	@GetMapping("/show/{id}")
	public String show(@ModelAttribute("answers") Answer answer, @PathVariable("id") Long id, Model model) {
		model.addAttribute("qus", this.overService.findSingQus(id));
		return "showQs.jsp";
	}
	
	@PostMapping("/show/{id}")
	public String addAs(@Valid @ModelAttribute("answers") Answer answer, @PathVariable("id") Long id, BindingResult rslt, Model model) {
		if(rslt.hasErrors()) {
			model.addAttribute("qus", this.overService.findSingQus(answer.getQuest().getId()));
			return "showQs.jsp";
		}
		this.overService.addAs(answer);
		return "redirect:/show/{id}";
	}
	

}
