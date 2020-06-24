package br.com.primeup.cadastro.dominio;

/**
 * @author Pedro Macedo
 * Classe Cliente que faz referência em qual projeto o Funcionário está atuando
 *
 */
public class Cliente {

	private Long id;
	private String nome;
	
	public Cliente(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
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
	
}