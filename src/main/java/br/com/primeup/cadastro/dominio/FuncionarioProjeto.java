package br.com.primeup.cadastro.dominio;


/**
 * @author Pedro Macedo
 * Classe de Associação de um Funcionário a um Projeto
 *
 */
public class FuncionarioProjeto {
	
	private String id;
	private Integer quantidadeDeHoras;
	private Integer ano;
	
	
	/**
	 * @param id
	 * @param quantidadeDeHoras
	 * @param ano
	 */
	public FuncionarioProjeto(String id, Integer quantidadeDeHoras, Integer ano) {
		super();
		this.id = id;
		this.quantidadeDeHoras = quantidadeDeHoras;
		this.ano = ano;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public Integer getQuantidadeDeHoras() {
		return quantidadeDeHoras;
	}
	
	public void setQuantidadeDeHoras(Integer quantidadeDeHoras) {
		this.quantidadeDeHoras = quantidadeDeHoras;
	}
	
	public Integer getAno() {
		return ano;
	}
	
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	
}