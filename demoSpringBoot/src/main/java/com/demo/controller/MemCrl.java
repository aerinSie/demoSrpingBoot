package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mem")
public class MemCrl {
	@RequestMapping("/show")
	public String showMemList() {
		return "showMemList";
	}

	@RequestMapping("/add")
	public String addMem() {
		return "add!";
	}
}