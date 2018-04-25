package com.br.ufc.vev.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.br.ufc.vev.model.Sessao;
import com.br.ufc.vev.repository.SessaoRepository;

public class SessaoService {
	
	@Autowired
	private SessaoRepository repository;
	
	public List<Sessao> findAll() {
        return repository.findAll();
    }
	
    public Sessao findOne(Long id) {
    	Optional<Sessao> optional =  repository.findById(id);
    	if (optional.isPresent())
    		return optional.get();
    	else
    		return null;
    }
     
    public Sessao save(Sessao sessao) {
        return repository.saveAndFlush(sessao);
    }
     
    public void delete(Long id) {
        repository.deleteById(id);
    }

}
