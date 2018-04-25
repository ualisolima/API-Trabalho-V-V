package com.br.ufc.vev.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Ator extends Pessoa{
	
	@ManyToMany(mappedBy = "atores")
	private List<Filme> filmes; 

	public List<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}
	
	
	
}
