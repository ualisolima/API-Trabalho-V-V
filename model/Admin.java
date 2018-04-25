package com.br.ufc.vev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;

@Entity
public class Admin{
	
	@Id
	@SequenceGenerator(name = "admin_seq", sequenceName = "admin_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "admin_seq")
	private Long id_admin;
	
	@Column(nullable = false, length = 20)
	@NotBlank(message = "Login é uma informação  obrigatória")
	private String login;
	
	@Column(nullable = false, length = 20)
	@NotBlank(message = "Senha é uma informação  obrigatória")
	private String senha;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
