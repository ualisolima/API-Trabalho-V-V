package com.br.ufc.vev.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.br.ufc.vev.model.Diretor;
import com.br.ufc.vev.repository.DiretorRepository;

public class DiretorService {
	
	@Autowired
	private DiretorRepository repository;
	
	public List<Diretor> findAll() {
        return repository.findAll();
    }
	
    public Diretor findOne(Long id) {
    	Optional<Diretor> optional =  repository.findById(id);
    	if (optional.isPresent())
    		return optional.get();
    	else
    		return null;
    }
     
    public Diretor save(Diretor diretor) {
        return repository.saveAndFlush(diretor);
    }
     
    public void delete(Long id) {
        repository.deleteById(id);
    }

}
