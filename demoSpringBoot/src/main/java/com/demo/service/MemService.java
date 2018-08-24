package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.MemDao;
import com.demo.model.MemVo;

@Service
public class MemService {
	@Autowired
	MemDao memberDao;
	public void addMember(MemVo memVo){
		memberDao.ShowMember(memVo);
	}
}
