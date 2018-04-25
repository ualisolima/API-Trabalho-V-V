package com.br.ufc.vev.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;

import com.br.ufc.vev.Enums.Genero;

@Entity
public class Filme {
	
	@Id
	@SequenceGenerator(name = "filme_seq", sequenceName = "filme_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "filme_seq")
	private Long id_filme;
	
	@Column(nullable = false)
	@NotBlank(message = "Nome do filme é uma informação obrigatória")
	private String nome;
	
	@ManyToMany
	@JoinTable(name = "filme_tem_atores",
			joinColumns = {@JoinColumn(name = "id_filme") },
			inverseJoinColumns = { @JoinColumn(name = "id_ator") })
	private List<Ator> atores;
	
	@ManyToMany
	@JoinTable(name = "filme_tem_diretores",
			joinColumns = {@JoinColumn(name = "id_filme") },
			inverseJoinColumns = { @JoinColumn(name = "id_diretor") })
	private List<Diretor> diretores;
	
	@Column(nullable = false)
	@NotBlank(message = "Genero do filme é uma informação obrigatória")
	@Enumerated(EnumType.STRING)
	private Genero genero;
	
	@Column(nullable = false)
	@NotBlank(message = "Sinopse do filme é uma informação obrigatória")
	private String sinopse;
	//duração em minutos
	@Column(nullable = false)
	@NotBlank(message = "Duração do filme é uma informação obrigatória")
	private Long duracao;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "filme")
	private List<Sessao> sessoes;
	
	public Long getId_filme() {
		return id_filme;
	}
	public void setId_filme(Long id_filme) {
		this.id_filme = id_filme;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Ator> getAtores() {
		return atores;
	}
	public void setAtores(List<Ator> atores) {
		this.atores = atores;
	}
	public List<Diretor> getDiretores() {
		return diretores;
	}
	public void setDiretores(List<Diretor> diretores) {
		this.diretores = diretores;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public String getSinopse() {
		return sinopse;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	public Long getDuracao() {
		return duracao;
	}
	public void setDuracao(Long duracao) {
		this.duracao = duracao;
	}
	public List<Sessao> getSessoes() {
		return sessoes;
	}
	public void setSessoes(List<Sessao> sessoes) {
		this.sessoes = sessoes;
	}
	
	

}
