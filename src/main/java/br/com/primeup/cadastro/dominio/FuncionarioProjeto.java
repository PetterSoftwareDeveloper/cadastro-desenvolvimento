package br.com.primeup.cadastro.dominio;

import br.com.primeup.cadastro.dominio.enums.EnumMes;

/**
 * @author Pedro Macedo
 * Classe de Associação de um Funcionário a um Projeto
 *
 */
public class FuncionarioProjeto {
	
	private Long id;
	private int quantidadeDeHoras;
	private int ano;
	private EnumMes enummes;
	
	public FuncionarioProjeto(Long id, int quantidadeDeHoras, int ano, EnumMes enummes) {
		super();
		this.id = id;
		this.quantidadeDeHoras = quantidadeDeHoras;
		this.ano = ano;
		this.enummes = enummes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getQuantidadeDeHoras() {
		return quantidadeDeHoras;
	}

	public void setQuantidadeDeHoras(int quantidadeDeHoras) {
		this.quantidadeDeHoras = quantidadeDeHoras;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public EnumMes getEnummes() {
		return enummes;
	}

	public void setEnummes(EnumMes enummes) {
		this.enummes = enummes;
	}
	
}