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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;

import com.br.ufc.vev.Enums.TipoSala;

@Entity
public class Sala {
	
	@Id
	@SequenceGenerator(name = "sala_seq", sequenceName = "sala_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sala_seq")
	private Long id_sala;
	
	@Column(nullable = false)
	@NotBlank(message = "Tipo da sala é uma informação obrigatória")
	@Enumerated(EnumType.STRING)
	private TipoSala tipo;
	
	@Column(nullable = false)
	@NotBlank(message = "Capacidade da sala é uma informação obrigatória")
	private Long capacidade;
	
	@ManyToOne
	@JoinColumn(name = "id_cinema")
	private Cinema cinema;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "sala")
	private List<Sessao> sessoes;
	
	public Long getId_sala() {
		return id_sala;
	}
	public void setId_sala(Long id_sala) {
		this.id_sala = id_sala;
	}
	public TipoSala getTipo() {
		return tipo;
	}
	public void setTipo(TipoSala tipo) {
		this.tipo = tipo;
	}
	public Long getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(Long capacidade) {
		this.capacidade = capacidade;
	}
	public Cinema getCinema() {
		return cinema;
	}
	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}
	public List<Sessao> getSessoes() {
		return sessoes;
	}
	public void setSessoes(List<Sessao> sessoes) {
		this.sessoes = sessoes;
	}
	
	
	

}
