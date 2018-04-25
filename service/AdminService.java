package com.br.ufc.vev.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.ufc.vev.model.Admin;
import com.br.ufc.vev.repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository repository;
	
	public List<Admin> findAll() {
        return repository.findAll();
    }
	
	public Admin findByLogin(String login) {
		List<Admin> admins = repository.findByLogin(login);
		if (admins.size() > 0)
			return admins.get(0);
		return null;
	}
     
    public Admin findOne(Long id) {
    	Optional<Admin> optional =  repository.findById(id);
    	if (optional.isPresent())
    		return optional.get();
    	else
    		return null;
    }
     
    public Admin save(Admin admin) {
        return repository.saveAndFlush(admin);
    }
     
    public void delete(Long id) {
        repository.deleteById(id);
    }

}
