package com.br.ufc.vev.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.br.ufc.vev.model.Pessoa;
import com.br.ufc.vev.repository.PessoaRepository;

public class PessoaService {
	
	@Autowired
	private PessoaRepository repository;
	
	public List<Pessoa> findAll() {
        return repository.findAll();
    }
	
    public Pessoa findOne(Long id) {
    	Optional<Pessoa> optional =  repository.findById(id);
    	if (optional.isPresent())
    		return optional.get();
    	else
    		return null;
    }
     
    public Pessoa save(Pessoa pessoa) {
        return repository.saveAndFlush(pessoa);
    }
     
    public void delete(Long id) {
        repository.deleteById(id);
    }

}
