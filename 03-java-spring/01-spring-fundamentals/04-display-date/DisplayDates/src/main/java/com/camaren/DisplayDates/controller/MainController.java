package com.camaren.DisplayDates.controller;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class MainController {
	
	
	
	
	@RequestMapping("/*")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		LocalDateTime time = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:m a");
		System.out.println(formatter.format(time));
		model.addAttribute("currentTime", formatter.format(time));
		
		return "time.jsp";
	}
	
	@GetMapping("/date")
	public String date(Model model) {
		
		LocalDateTime day = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("cccc, 'the ' d ' of '  MMMM, y");
		System.out.println(formatter.format(day));
		//String today = formatter.format(day);
		model.addAttribute("today", formatter.format(day));
		return "date.jsp";
	}

}
