package com.br.ufc.vev.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.ufc.vev.model.Cinema;
import com.br.ufc.vev.repository.CinemaRepository;

@Service
public class CinemaService {
	
	@Autowired
	private CinemaRepository repository;
	
	public List<Cinema> findAll() {
        return repository.findAll();
    }
	
    public Cinema findOne(Long id) {
    	Optional<Cinema> optional =  repository.findById(id);
    	if (optional.isPresent())
    		return optional.get();
    	else
    		return null;
    }
     
    public Cinema save(Cinema cinema) {
        return repository.saveAndFlush(cinema);
    }
     
    public void delete(Long id) {
        repository.deleteById(id);
    }

}
