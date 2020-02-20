package com.stefanini.pessoa.filter;


import java.io.Serializable;



public class UsuarioFilter implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private String email;
	private String login;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	

}
