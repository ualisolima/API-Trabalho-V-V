package com.br.ufc.vev.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Diretor extends Pessoa{
	
	@ManyToMany(mappedBy = "diretores")
	private List<Filme> filmes;

	public List<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}
	

}
