package br.com.senai.pessoa;

import java.util.ArrayList;
import java.util.List;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		
		List<Pessoa> pessoa = new ArrayList<>();

		PessoaController pessoaController = new PessoaController();

		boolean sair = false;

		do {
		pessoaController.menu();

		int opcao = pessoaController.leOpcao();

		switch (opcao) {
		case 1:
		pessoa.add(pessoaController.cadastrarPessoa());
		break;


		case 2:
		Object pessoas;
		pessoaController.listarPessoas(pessoa);
		break;

		case 9:
		sair = true;
		break;

		default:
		System.out.println("Op��o Invalida!");
		break;
		}
		} while (!sair);

		System.out.println("Sistema finalizado!");
		
	}
}
