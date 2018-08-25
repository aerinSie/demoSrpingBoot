package com.demo.iface;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.MemberAccountJPA;

public interface MemIface extends JpaRepository<MemberAccountJPA, Long> {
	List<MemberAccountJPA> findAll();

	List<MemberAccountJPA> findByEmail(String email);
}
