package br.com.primeup.cadastro.dominio;

import java.util.Date;

/**
 * @author Pedro Macedo
 * Classe referente em qual Projeto o Funcionário está atuando.
 *
 */
public class Projeto {
	
	private String id;
	private String nome;
	private String apelido;
	private String chave;
	private Date dataInicio;
	private Date dataTermino;
	
	/**
	 * @param id
	 * @param nome
	 * @param apelido
	 * @param chave
	 * @param dataInicio
	 * @param dataTermino
	 */
	public Projeto(String id, String nome, String apelido, String chave, Date dataInicio, Date dataTermino) {
		super();
		this.id = id;
		this.nome = nome;
		this.apelido = apelido;
		this.chave = chave;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getApelido() {
		return apelido;
	}
	
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
	public String getChave() {
		return chave;
	}
	
	public void setChave(String chave) {
		this.chave = chave;
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