package com.br.ufc.vev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;

@Entity
public class Pessoa {
	
	@Id
	@SequenceGenerator(name = "pessoa_seq", sequenceName = "pessoa_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pessoa_seq")
	private Long id_pessoa;
	
	@Column(nullable = false, length = 50)
	@NotBlank(message = "Nome da Pessoa é uma informação obrigatória")
	private String nome;
	
	@Column(nullable = false, length = 50)
	@NotBlank(message = "Nome da Pessoa é uma informação obrigatória")
	private String sobre;
	
	public Long getId_pessoa() {
		return id_pessoa;
	}
	public void setId_pessoa(Long id_pessoa) {
		this.id_pessoa = id_pessoa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobre() {
		return sobre;
	}
	public void setSobre(String sobre) {
		this.sobre = sobre;
	}

}
