package br.com.primeup.cadastro.dominio;

import java.util.Date;

/**
 * @author Pedro Macedo
 * Classe referente em qual Projeto o Funcionário está atuando.
 *
 */
public class Projeto {
	
	private Long id;
	private String nome;
	private String projectKey;
	private String apelido;
	private Date dataInicio;
	private Date dataTermino;
	
	public Projeto(Long id, String nome, String projectKey, String apelido, Date dataInicio, Date dataTermino) {
		super();
		this.id = id;
		this.nome = nome;
		this.projectKey = projectKey;
		this.apelido = apelido;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProjectKey() {
		return projectKey;
	}

	public void setProjectKey(String projectKey) {
		this.projectKey = projectKey;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
	}
	
}