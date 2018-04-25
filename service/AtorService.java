package com.br.ufc.vev.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.ufc.vev.model.Ator;
import com.br.ufc.vev.repository.AtorRepository;

@Service
public class AtorService {
	
	@Autowired
	private AtorRepository repository;
	
	public List<Ator> findAll() {
        return repository.findAll();
    }
	
    public Ator findOne(Long id) {
    	Optional<Ator> optional =  repository.findById(id);
    	if (optional.isPresent())
    		return optional.get();
    	else
    		return null;
    }
     
    public Ator save(Ator ator) {
        return repository.saveAndFlush(ator);
    }
     
    public void delete(Long id) {
        repository.deleteById(id);
    }

}
