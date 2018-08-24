package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCrl {
	@RequestMapping("/rest")
	public String login() {
		return "rest ctrl!";
	}
	
	
}
