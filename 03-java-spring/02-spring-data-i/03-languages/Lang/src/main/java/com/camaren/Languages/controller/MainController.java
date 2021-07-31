package com.camaren.Languages.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import javax.validation.Valid;
import com.camaren.Languages.models.Lang;
import com.camaren.Languages.service.LangService;


@Controller
public class MainController {
	
	private final LangService langService;
	public MainController(LangService service) {
		this.langService = service;
	}
	
	@GetMapping("/")
	public String index(Model model, @ModelAttribute("Lang") Lang language) {
		model.addAttribute("allLang", this.langService.allLang());
		return "index.jsp";
	}
	
	@PostMapping("/")
	public String addLang(@Valid @ModelAttribute("Lang") Lang language, BindingResult rslt, Model model) {
		if(rslt.hasErrors()) {
			return "errorOnUserPt.jsp";
		}
		this.langService.makeLang(language);
		return "redirect:/";
	}
	
	@GetMapping("/show/{id}")
	public String displayLang(Model model, @PathVariable Long id) {
		model.addAttribute("thisLang", this.langService.findLang(id));
		return "displayLang.jsp";
	}
	
	@GetMapping("/{id}/edit")
	public String editLang(Model model, @PathVariable("id") Long id) {
		model.addAttribute("Lang", this.langService.findLang(id));
		return "editLang.jsp";
	}
	
	@PutMapping("/{id}/edit")
	public String editLang(@Valid @ModelAttribute("Lang") Lang language, BindingResult rslt, Model model, @PathVariable("id") Long id) {
		if(rslt.hasErrors()) {
			model.addAttribute("Lang", this.langService.findLang(id));
			return "editLang.jsp";
		}
		this.langService.updtLang(language);
		return "redirect:/";
	}
	
	@DeleteMapping("/delete/{id}")
	public String removeLang(@PathVariable Long id) {
		this.langService.removeLang(id);
		return "redirect:/";
	}
	
	
} 
