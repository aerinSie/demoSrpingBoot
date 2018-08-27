package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.MemVo;

@RestController
public class RestCrl {
	@RequestMapping("/rest")
	public String login() {
		return "rest ctrl!";
	}
	
	
	@Autowired
	MemVo memberAccount;
	
	 @RequestMapping("/memberApi/memberTest")
	 public MemVo memberTest() {
		 MemVo memberAccount = new MemVo();
		 memberAccount.setAddress("台北市");
		 memberAccount.setCellphone("09123456789");
		 memberAccount.setEmail("test@gmail.com");
		 memberAccount.setId(1);
		 memberAccount.setPassword("123456789");
		 return memberAccount;
	 }
}