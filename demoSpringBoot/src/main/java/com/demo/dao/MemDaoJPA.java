package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.MemVo;

@Repository
public class MemDaoJPA {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public String showMember(MemVo memVo) {
		StringBuilder sql =new StringBuilder();

		return "show";

	}

	public void addMember(MemVo memberAccount) {
		StringBuilder sql =new StringBuilder();
		sql.append(" INSERT INTO mem(PASSWORD, EMAIL, ADDRESS,CELLPHONE,CREATE_DATE) ")
		.append(" VALUES (?,?,?,?,NOW()) ")
		.append(memberAccount.getPassword().toString()).append(", ")
		.append(memberAccount.getEmail().toString()).append(", ")
		.append(memberAccount.getAddress().toString()).append(", ")
		.append(memberAccount.getCellphone().toString());
		
		jdbcTemplate.update(sql.toString());
//		jdbcTemplate.update(
//				"INSERT INTO mem(PASSWORD, EMAIL, ADDRESS,CELLPHONE,CREATE_DATE) "
//						+ "VALUES (?,?,?,?,NOW())",
//				memberAccount.getPassword(), memberAccount.getEmail(), memberAccount.getAddress(),
//				memberAccount.getCellphone());
	}

}
