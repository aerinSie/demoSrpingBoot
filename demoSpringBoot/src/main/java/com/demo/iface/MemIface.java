package com.demo.iface;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.model.MemVoJPA;

/**
 * 
 * JpaRepository已提供多種增刪改查方法
 * 
 * @author aerin
 */
public interface MemIface extends JpaRepository<MemVoJPA, Long> {
	List<MemVoJPA> findAll();

	List<MemVoJPA> findByEmail(String email);

//	@Query(value = "select id,email,password,address,cellphone from test.mem where EMAIL = ?1 and PASSWORD = ?2 ", nativeQuery = true)
//	List<MemVoJPA> findCheckMemberAccount(String email, String password);

}
