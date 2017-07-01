package com.example.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@EnableAutoConfiguration
@RequestMapping("test")
public class WelcomeController {

	@RequestMapping(method = RequestMethod.GET)
	public String welcome() {
		return "test/hello";
	}
}
