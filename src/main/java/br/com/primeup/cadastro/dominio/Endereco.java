package br.com.primeup.cadastro.dominio;

import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * @author Pedro Macedo
 * Classe Endereço referente ao Funcionário
 *
 */

@Entity
@Table(name = "ENDERECO")
public class Endereco {
	
	private Long id;
	private String cep;
	private String estado;
	private String cidade;
	private String logradouro;
	private int numero;
	private String complemento;
	
	public Endereco(Long id, String cep, String estado, String cidade, String logradouro, int numero,
			String complemento) {
		super();
		this.id = id;
		this.cep = cep;
		this.estado = estado;
		this.cidade = cidade;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
}
