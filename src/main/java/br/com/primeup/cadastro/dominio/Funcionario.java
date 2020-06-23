package br.com.primeup.cadastro.dominio;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Pedro Macedo
 * Classe Funcionário que é utilizada para armazenamento dos dados do Funcionário.
 *
 */
@Entity
@Table(name = "FUNCIONARIO")
public class Funcionario {
	
	private String id;
	private String nome;
	private String email;
	private String apelido;
	private Date dataNascimento;
	private Double custo;
	private Double horasBaseDoMes;
	
	
	/**
	 * @param id
	 * @param nome
	 * @param email
	 * @param apelido
	 * @param dataNascimento
	 * @param custo
	 * @param horasBaseDoMes
	 */
	public Funcionario(String id, String nome, String email, String apelido, Date dataNascimento, Double custo,
			Double horasBaseDoMes) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.apelido = apelido;
		this.dataNascimento = dataNascimento;
		this.custo = custo;
		this.horasBaseDoMes = horasBaseDoMes;
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
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getApelido() {
		return apelido;
	}
	
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public Double getCusto() {
		return custo;
	}
	
	public void setCusto(Double custo) {
		this.custo = custo;
	}
	
	public Double getHorasBaseDoMes() {
		return horasBaseDoMes;
	}
	
	public void setHorasBaseDoMes(Double horasBaseDoMes) {
		this.horasBaseDoMes = horasBaseDoMes;
	}
	
}
