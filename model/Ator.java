package com.br.ufc.vev.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Ator extends Pessoa{
	
	@Id
	@SequenceGenerator(name = "autor_seq", sequenceName = "autor_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "autor_seq")
	private Long id_ator;
	
	@ManyToMany(mappedBy = "atores")
	private List<Filme> filmes; 

	public Long getId_ator() {
		return id_ator;
	}

	public void setId_ator(Long id_ator) {
		this.id_ator = id_ator;
	}

	public List<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}
	
	
	
}
