package com.demo.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.MemVoJPA;

public interface MemServiceJPA extends JpaRepository<MemVoJPA, Long> {

	List<MemVoJPA> findAll();

	List<MemVoJPA> findByEmail(String email);
}
