package com.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.demo.iface.MemIface;
import com.demo.model.MemberAccountJPA;

@Controller
public class MemJPACrl {
	@Autowired
	MemIface memberRepository;

	@Autowired
	DataSource dataSource;

	@GetMapping("/addMemberPage")
	public String addMemberPage() {

		List<MemberAccountJPA> memberAccountJPA = new ArrayList<MemberAccountJPA>();
		memberAccountJPA = memberRepository.findAll();

		for (int i = 0; i < memberAccountJPA.size(); i++) {
			System.out.println(memberAccountJPA.get(i).getId());
		}
		return "addMemberPage";
	}
}
