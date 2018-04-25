package com.br.ufc.vev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.ufc.vev.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long>{
	
	public List<Admin> findByLogin(String login);

}
