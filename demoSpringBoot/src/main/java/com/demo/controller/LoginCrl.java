package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginCrl {
	@RequestMapping("/login")
	public String showCustomers() {
		//導向login.jsp頁面
		//src/main/webapp/WEB-INF/jsp/login.jsp
		return "login";
	}

	@RequestMapping("/login2")
	public String showCustomers2() {
		return "login2";
	}

}
