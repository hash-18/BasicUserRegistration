package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.Model.User;
import com.spring.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(path="/showForm", method = RequestMethod.GET)
	public String showForm()
	{
		return "Form";
	}
	@RequestMapping(path="/processForm1", method=RequestMethod.POST)
	public String processForm1(@RequestParam("username") String userName, @RequestParam("password") String password, @RequestParam("email") String email, Model model)
	{
		//Adding attributes to model individually
		model.addAttribute("email",email);
		model.addAttribute("userName",userName);
		model.addAttribute("password",password);
		
		// To print on console
		System.out.println(userName);
		System.out.println(password);
		System.out.println(email);
		return "success";
	}
	
	// Using Object class along with Req Param
	@RequestMapping(path="/processForm2", method=RequestMethod.POST)
	public String processForm2(@RequestParam("username") String userName, @RequestParam("password") String password, @RequestParam("email") String email, Model model)
	{
		User user=new User();
		user.setEmail(email);
		user.setUsername(userName);
		user.setPassword(password);
	//"To print on console"
		System.out.println(user);
		
		//Adding attributes to model via Model class
		model.addAttribute("User",user);
		
		
		return "abc";
	}
	
	// Using Model Attribute
	@RequestMapping(path="/processForm3", method=RequestMethod.POST)
	public String processForm3(@ModelAttribute User user, Model model)
	{
		
		//Redirect to showForm if username is empty
		
		if(user.getUsername().isEmpty())
			return "redirect:/showForm";
		
	//"To print on console"
		System.out.println("Using Model Attribute insteaad of Request Param");
		System.out.println(user);
		
		
		this.userService.createUser(user);
		
		
		model.addAttribute("user", user);
		
		//Adding attributes to model via Model class
		
		
		
		return "success";
	}

}
