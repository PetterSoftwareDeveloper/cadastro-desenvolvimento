package br.com.primeup.cadastro.dominio;

/**
 * @author Pedro Macedo
 * Classe Cargo Referente a Função do Funcionário
 *
 */
public class Cargo {

	private Long id;
	private String nome;
	
	public Cargo(Long id, String nome) {
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
