package com.camaren.ControllerViews.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.camaren.ControllerViews.models.User;
import com.camaren.ControllerViews.service.UserService;

@Controller
public class UsersController {
private final UserService userService;
	    
public UsersController(UserService userService) {
	this.userService = userService;
	}
	    
@RequestMapping("/registration")
	public String registerForm(@ModelAttribute("user") User user) {
		return "registrationPage.jsp";
	    }
	@RequestMapping("/login")
	    public String login() {
	        return "loginPage.jsp";
	    }
	    
	    @RequestMapping(value="/registration", method=RequestMethod.POST)
	    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
	// if result has errors, return the registration page (don't worry about validations just now)
	        // else, save the user in the database, save the user id in session, and redirect them to the /home route
	    	
	    	if(result.hasErrors()) {
	    		return "regristrationPage.jsp";
	    	}
	    	
	    	User usr = userService.registerUser(user);
	    	session.setAttribute("userId", usr.getId());
	    	return "redirect:/home";
	    }
	    
	    @RequestMapping(value="/login", method=RequestMethod.POST)
	    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
	        // if the user is authenticated, save their user id in session
	        // else, add error messages and return the login page
	    	boolean isAuth = userService.authenticateUser(email, password);
	    		if(isAuth) {
	    			User usr= userService.findByEmail(email);
	    			session.setAttribute("userId", usr.getId());
	    			return "redirect:/home";
	    		}
	    		else {
	    			model.addAttribute("error", "Invalid Creds, Try Again");
	    			return "loginPage.jsp";
	    		}
	    	
	    	
	    }
	    
	    @RequestMapping("/home")
	    public String home(HttpSession session, Model model) {
	        // get user from session, save them in the model and return the home page
	    	Long usrId = (Long) session.getAttribute("userId");
	    	User usr = userService.findUserById(usrId);
	    	model.addAttribute("user", usr);
	    	return "homePage.jsp";
	    }
	    @RequestMapping("/logout")
	    public String logout(HttpSession session) {
	        // invalidate session
	        // redirect to login page
	    	return "redirect:/login";
	    }
	
	
	
}
