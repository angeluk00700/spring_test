package com.example.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@EnableAutoConfiguration
@RequestMapping("test")
public class WelcomeController {

	@RequestMapping(method = RequestMethod.GET)
	public String welcome(String name, Model model) {
		System.out.println("name : " + name);
		model.addAttribute("name", name);
		return "test/hello";
	}
}
