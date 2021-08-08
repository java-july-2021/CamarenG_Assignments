package com.camaren.DojoNinjas.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.camaren.DojoNinjas.models.Dojo;
import com.camaren.DojoNinjas.models.Ninja;
import com.camaren.DojoNinjas.service.DojoService;
import com.camaren.DojoNinjas.service.NinjaService;

@Controller
public class MainDojoController {
	@Autowired

	private  DojoService dojoService;
	@Autowired
	private  NinjaService ninjaService;
	
	
	
	
	@GetMapping("/")
	public String index(Model model, @ModelAttribute("Dojo") Dojo dojo) {
		
		List<Dojo> allDojos = this.dojoService.allDojo();	

		model.addAttribute("allDojo", allDojos);
		return "index.jsp";
	}
	
	
	
	//----------------------------------------------------------------------------------------------------
	
	
	
	@GetMapping("/createDojo")
	public String newDojo(@ModelAttribute("Dojo") Dojo dojo) {
		return "createDojo.jsp";
	}
	
	@PostMapping("/addDojo")
	public String addDojo(@Valid @ModelAttribute("Dojo") Dojo dojo, BindingResult rslt) {
		if(rslt.hasErrors()) {
			return "createDojo.jsp";
		}
		this.dojoService.create(dojo);
		return "redirect:/";
	}
	
	@GetMapping("/{id}")
	public String displayDojo(Model model, @PathVariable("id") Long id) {
		//Dojo dojoToDisplay = this.dojoService.oneDojo(id);
		model.addAttribute("Dojo", this.dojoService.oneDojo(id));
		
		return "showDojo.jsp";
	}
	
	
	
	
	
	//---------------------------------------------------------------------------------------------------
	
	
	
	@GetMapping("/addStudent")
	public String addStudent(@ModelAttribute("Ninja") Ninja ninja, Model model) {
		List<Dojo> allDojos = this.dojoService.allDojo();
		model.addAttribute("allDojos", allDojos);
		return "addStudents.jsp";
	}
	
	@PostMapping("/newStudent")
	public String newStudent(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult rslt, Model model) {
		if(rslt.hasErrors()) {
			List<Dojo> allDojos = this.dojoService.allDojo();
			model.addAttribute("allDojos", allDojos);
			return "addStudents.jsp";
		}
		this.ninjaService.makeNinja(ninja);
		return "redirect:/";
	}
	
}
