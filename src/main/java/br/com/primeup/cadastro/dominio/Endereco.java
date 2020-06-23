package br.com.primeup.cadastro.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Pedro Macedo
 * Classe Endereço referente ao Funcionário
 *
 */

@Entity
@Table(name = "ENDERECO")
public class Endereco {
	
	@Size(min = 3, max = 255)
	@Column(nullable = false)
	private String id;

	@Size(min = 3, max = 255)
	@Column(nullable = false)
	private String cep;
	
	@NotNull(message = "{NotNull.endereco.estado}")
	@Digits(integer = 5, fraction = 0)
	@Column(nullable = false, length = 5)
	private String estado;
	
	@Size(min = 3, max = 255)
	@Column(nullable = false)
	private String cidade;
	
	@Size(min = 3, max = 255)
	@Column(nullable = false)
	private String logradouro;
	
	@Size(min = 3, max = 255)
	@Column(nullable = false)
	private String complemento;
	
	
	@NotNull(message = "{NotNull.endereco.numero}")
	@Digits(integer = 5, fraction = 0)
	@Column(nullable = false, length = 5)
	private Integer numero;
	
	
	/**
	 * @param id
	 * @param cep
	 * @param estado
	 * @param cidade
	 * @param logradouro
	 * @param complemento
	 * @param numero
	 */
	public Endereco(String id, String cep, String estado, String cidade, String logradouro, String complemento,
			Integer numero) {
		super();
		this.id = id;
		this.cep = cep;
		this.estado = estado;
		this.cidade = cidade;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.numero = numero;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
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
	
	public String getComplemento() {
		return complemento;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public Integer getNumero() {
		return numero;
	}
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
}
