package br.com.primeup.cadastro.dominio;

import javax.persistence.Column;

public class Usuario {
	
	/**
	 * Nome completo do usu�rio
	 */
	@Column(name = "NM_USUARIO", insertable = false, updatable = false)
	private String nome;

	/**
	 * Senha do usu�rio utilizada na autentica��o
	 */
	private String senha;

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}