package com.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.iface.MemIface;
import com.demo.model.MemVoJPA;

@Controller
public class MemJPACrl {
	@Autowired
	MemIface memIface;

	/*
	 * findAll()
	 */
	@GetMapping("/queryMemList")
	public String showMem(Model model) {
		List<MemVoJPA> memList = new ArrayList<MemVoJPA>();
		memList = memIface.findAll();
		model.addAttribute("memList", memList);
		return "queryMemList";
	}

	/*
	 * findByEmail 方法一：@RequestParam("email")String email 方法二：MemVoJPA memVoJPA
	 * 方法三：HttpServletRequest request
	 */
	@GetMapping("/findByEmail")
	public String findByEmail(@RequestParam("email") String email, MemVoJPA memVoJPA, HttpServletRequest request,
			Model model) {
		List<MemVoJPA> memList = new ArrayList<MemVoJPA>();

		memList = memIface.findByEmail(email);
		memList = memIface.findByEmail(memVoJPA.getEmail());
		memList = memIface.findByEmail(request.getParameter("email"));

		// session傳
		model.addAttribute("memList", memList);
		return "findByEmail";
	}

}
