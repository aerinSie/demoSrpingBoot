package com.demo.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.MemVoJPA;

@Repository
public class MemDaoJPA {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public String showMember(MemVoJPA memVo) {
		StringBuilder sql =new StringBuilder();

		return "show";

	}

	public void addMember(MemVoJPA memberAccount) {
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

	public void save(MemVoJPA memberaccount) {
		// TODO Auto-generated method stub
		
	}

	public void deleteById(long id) {
		// TODO Auto-generated method stub
		
	}

	public Optional<MemVoJPA> findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
