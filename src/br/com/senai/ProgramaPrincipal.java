package br.com.senai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		Pessoa pessoa4 = new Pessoa();
		
		pessoa1.setNome("Marlon");
		pessoa1.setAnoDeNascimento(2004);
		pessoa1.setSexo("M");
		
		pessoa2.setNome("Mayara");
		pessoa2.setAnoDeNascimento(1989);
		pessoa2.setSexo("F");
		
		pessoa3.setNome("L?via");
		pessoa3.setAnoDeNascimento(2012);
		pessoa3.setSexo("F");
		
		pessoa4.setNome("Anthony");
		pessoa4.setAnoDeNascimento(2000);
		pessoa4.setSexo("M");
		
		pessoas.add(pessoa1); 
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);
		
		System.out.println("--- PESSOAS com FOR ---");
		for(int i = 0; i < pessoas.size(); i++) {
			System.out.println(pessoas.get(i));
			System.out.println("-------------------------------");
			}
		
		System.out.println("--- PESSOAS CADASTRADAS ---");
		for(Pessoa people : pessoas) {
			System.out.println(people.getNome());
			System.out.println(people.getanoDeNascimento());
			System.out.println(people.getSexo());
			System.out.println("-------------------------");
		}
		Scanner tec = new Scanner(System.in);
		MetodoController pessoaController = new MetodoController();
		
		System.out.println("--- TABUADA ---");
		MetodoController.multiplicar();
	
		System.out.println("--- SOMA DE DOIS VALORES ---");
		System.out.println("A soma d?: " + pessoaController.somar());
		
		System.out.println("--- SUBTRA??O DE VALORES por par?metro---");
		System.out.println("Informe o Primeiro valor: ");
		int valor1 = tec.nextInt();
		System.out.println("Informe o Segundo valor: ");
		int valor2 = tec.nextInt();
		System.out.println("A subtra??o d?: " + pessoaController.subtrair(valor1, valor2));
		
	}
}

