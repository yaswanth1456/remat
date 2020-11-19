package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.User;

@Controller
public class MvcController {
//dummy chainge dsgsdg
	@RequestMapping("/")
	public String home() {
		System.out.println("Going home...");
		return "index";
	}
	@RequestMapping("/register")
	public String showForm(Model model) {
	    User user = new User();
	   
	     
	    model.addAttribute("user", user);
	 
	     
	    return "register_form";
	}
	@PostMapping("/register")
	public String submitForm(@ModelAttribute("user") User user) {
		//User user = new User();
	     user.setName(user.getName()+"reddy");
	    System.out.println(user);
	     
	    return "register_success";
	}
	
}