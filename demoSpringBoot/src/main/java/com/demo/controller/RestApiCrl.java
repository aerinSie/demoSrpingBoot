package com.demo.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dao.MemDaoJPA;
import com.demo.model.MemVoJPA;

@RestController
@RequestMapping("/memberApi")
public class RestApiCrl {
	@Autowired
	MemDaoJPA memDao;

	//設定返回的response的媒體類型和文字的編碼,ex:返回為JSON格式,字元編碼為UTF-8
	@RequestMapping(value="/{id}",produces={"application/json;charset=UTF-8"})
	public Optional<MemVoJPA> read(@PathVariable long id) {
			return memDao.findById(id);
		 }

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void create(@RequestBody MemVoJPA memberaccount) {
		memDao.save(memberaccount);
	}

	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void update(@RequestBody MemVoJPA memberaccount) {
		memDao.save(memberaccount);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable long id) {
		memDao.deleteById(id);

	}
	
	@RequestMapping(value="/{id}")
	 public Optional<MemVoJPA> read(@ModelAttribute("message") String msg,Model model,@PathVariable long id) {

		Map map = new HashMap();
		String email = map.get("EMAIL").toString();
		if(email == null) throw new NullPointerException(email);
		System.out.println(email);
		return memDao.findById(id);
	 }
}