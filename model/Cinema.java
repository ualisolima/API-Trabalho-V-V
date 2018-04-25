package com.br.ufc.vev.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;

@Entity
public class Cinema {
	
	@Id
	@SequenceGenerator(name = "cinema_seq", sequenceName = "cinema_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cinema_seq")
	private Long id_cinema;
	
	@Column(nullable = false)
	@NotBlank(message = "Endereoço do cinema é uma informação obrigatória")
	private String endereco;
	
	@Column(nullable = false)
	@NotBlank(message = "Nome do cinema é uma informação obrigatória")
	private String nome;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cinema")
	private List<Sala> salas;
	
	public Long getId_cinema() {
		return id_cinema;
	}
	public void setId_cinema(Long id_cinema) {
		this.id_cinema = id_cinema;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Sala> getSalas() {
		return salas;
	}
	public void setSalas(List<Sala> salas) {
		this.salas = salas;
	}
	
	

}
