package br.com.primeup.cadastro.dominio;

/**
 * @author Pedro Macedo
 * Classe Nível referente ao Cargo do Funcionário
 *
 */
public class Nivel {

	private Long id;
	private String nome;
	
	public Nivel(Long id, String nome) {
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