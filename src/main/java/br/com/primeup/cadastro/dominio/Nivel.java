package br.com.primeup.cadastro.dominio;

/**
 * @author Pedro Macedo
 * Classe Nível referente ao Cargo do Funcionário
 *
 */
public class Nivel {

	private String id;
	private String nome;
	
	
	/**
	 * @param id
	 * @param nome
	 */
	public Nivel(String id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
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

}