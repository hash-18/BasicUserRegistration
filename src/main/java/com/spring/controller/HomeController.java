package com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	
	public String home(Model model)
	{
		model.addAttribute("name", "Mayank Pandey");
		List<String> courses=new ArrayList<String>();
		courses.add("Java");
		courses.add("Python");
		courses.add("Spring");
		model.addAttribute("coursesList", courses);
		return "index";
	}

}
