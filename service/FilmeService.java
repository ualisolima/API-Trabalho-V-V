package com.br.ufc.vev.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.br.ufc.vev.model.Filme;
import com.br.ufc.vev.repository.FilmeRepository;

public class FilmeService {
	
	@Autowired
	private FilmeRepository repository;
	
	public List<Filme> findAll() {
        return repository.findAll();
    }
	
    public Filme findOne(Long id) {
    	Optional<Filme> optional =  repository.findById(id);
    	if (optional.isPresent())
    		return optional.get();
    	else
    		return null;
    }
     
    public Filme save(Filme filme) {
        return repository.saveAndFlush(filme);
    }
     
    public void delete(Long id) {
        repository.deleteById(id);
    }

}
