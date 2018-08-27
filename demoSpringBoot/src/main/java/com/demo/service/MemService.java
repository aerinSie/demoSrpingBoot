package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.MemDao;
import com.demo.model.MemVo;

@Service
public class MemService {
	@Autowired
	MemDao memDao;
	public void showMember(MemVo memVo){
		memDao.showMember(memVo);
	}
	
	public void addMember(MemVo memVo){
		memDao.addMember(memVo);

  }
}
