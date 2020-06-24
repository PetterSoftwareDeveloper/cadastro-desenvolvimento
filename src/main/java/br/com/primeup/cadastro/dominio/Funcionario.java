package br.com.primeup.cadastro.dominio;

import java.util.Date;


/**
 * @author Pedro Macedo
 * Classe Funcion�rio que � utilizada para armazenamento dos dados do Funcion�rio.
 *
 */

public class Funcionario {
	
	private Long id;
	private String nome;
	private String email;
	private String apelido;
	private Date dataNascimento;
	private Double custo;
	private int horasBaseDoMes;
	
	public Funcionario(Long id, String nome, String email, String apelido, Date dataNascimento, Double custo,
			int horasBaseDoMes) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.apelido = apelido;
		this.dataNascimento = dataNascimento;
		this.custo = custo;
		this.horasBaseDoMes = horasBaseDoMes;
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

	public int getHorasBaseDoMes() {
		return horasBaseDoMes;
	}

	public void setHorasBaseDoMes(int horasBaseDoMes) {
		this.horasBaseDoMes = horasBaseDoMes;
	}
	
}
