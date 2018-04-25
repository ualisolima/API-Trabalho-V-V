package com.br.ufc.vev.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.br.ufc.vev.model.Sala;
import com.br.ufc.vev.repository.SalaRepository;

public class SalaService {
	
	@Autowired
	private SalaRepository repository;
	
	public List<Sala> findAll() {
        return repository.findAll();
    }
	
    public Sala findOne(Long id) {
    	Optional<Sala> optional =  repository.findById(id);
    	if (optional.isPresent())
    		return optional.get();
    	else
    		return null;
    }
     
    public Sala save(Sala sala) {
        return repository.saveAndFlush(sala);
    }
     
    public void delete(Long id) {
        repository.deleteById(id);
    }

}
