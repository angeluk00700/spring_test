package com.example.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@EnableAutoConfiguration
@RequestMapping("angulartest")
public class AngularController {
	@RequestMapping(method = RequestMethod.GET)
	public String welcome() {
		return "test/angulartest";
	}
}
