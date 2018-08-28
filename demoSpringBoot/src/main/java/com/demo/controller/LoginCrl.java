package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginCrl {
	/**
	 * 進入 index 
	 * 處理 "/index" 的 GET 請求
	 */
//忽略模板	@ResponseBody
	
	
	@RequestMapping("/index")	public String showCustomers2() {
		
		return "index";
	}

}
