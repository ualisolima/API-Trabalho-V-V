package com.br.ufc.vev.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Diretor extends Pessoa{
	
	@Id
	@SequenceGenerator(name = "diretor_seq", sequenceName = "diretor_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "diretor_seq")
	private Long id_diretor;
	
	@ManyToMany(mappedBy = "diretores")
	private List<Filme> filmes;

	public Long getId_diretor() {
		return id_diretor;
	}

	public void setId_diretor(Long id_diretor) {
		this.id_diretor = id_diretor;
	}
	
	public List<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}
	

}
