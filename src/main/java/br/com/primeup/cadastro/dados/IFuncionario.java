package br.com.primeup.cadastro.dados;

import br.com.primeup.cadastro.dominio.Funcionario;

public interface IFuncionario {
	
	void cadastrar (Funcionario funcionario);

    void atualizar (Funcionario funcionario);

    void excluir (Long id);
    
    Funcionario obterFuncionario(Funcionario funcionario);
    
}
