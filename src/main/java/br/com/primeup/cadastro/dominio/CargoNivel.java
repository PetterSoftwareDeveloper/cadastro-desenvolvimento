package br.com.primeup.cadastro.dominio;

/**
 * @author Pedro Macedo
 * Classe Cargo Nivel referente o a hierarquia do Funcionário
 *
 */
public class CargoNivel {

	private Long id;

	public CargoNivel(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	

}
