package br.com.senai.pessoa;

	import java.util.List;
	import java.util.Scanner;

	public class PessoaController {
	

	private static final int Pessoas = 0;
	private static final int List = 0;
	private static final int Pessoa = 0;
	private Scanner tec;

	public PessoaController() {
		tec = new Scanner(System.in);
	}

	public int leOpcao() {
		System.out.println("> ");
	
	return tec.nextInt();
	}

	public void menu() {
		System.out.println("\n--- MENU ---");
		System.out.println("1) Cadastrar pessoa");
		System.out.println("2) Listar pessoas Cadastradas");
		System.out.println("9) Sair do sistema");
		System.out.println("-------------------");
	}

	public Pessoa cadastrarPessoa() { 
		Pessoa pessoa = new Pessoa();

		System.out.println("--- CADASTRAR PESSOA ---");
		System.out.println("Informe o nome: ");
			tec.nextLine();
		pessoa.setNome(tec.nextLine());

		System.out.println("Informe o ano de nascimento: ");
		pessoa.setAnoDeNascimento(tec.nextInt());

		System.out.println("Informe a altura: ");
		pessoa.setAltura(tec.nextDouble());
		
		System.out.print("Informe o nome do seu Estado: ");
		pessoa.setNomeDoEstado(tec.nextLine());
		tec.nextLine();
		System.out.print("Informe a sigla do seu Estado: ");
		pessoa.setSiglaDoEstado(tec.nextLine());
		
		System.out.print("Informe o nome da sua Cidade: ");
		pessoa.setNomeDaCidade(tec.nextLine());
		
		System.out.print("Informe o nome da Rua: ");
		pessoa.setRua(tec.nextLine());
		
		System.out.print("Informe o Bairro: ");
		pessoa.setBairro(tec.nextLine());
		
		System.out.print("Informe o número da casa: ");
		pessoa.setNumero(tec.nextInt());
		
		System.out.print("Informe o Complemento: ");
		pessoa.setComplemento(tec.nextLine());

		return pessoa;
		
	}
	
	public List<Pessoa> listarPessoas(List<Pessoa> pessoas){
		System.out.println("\n");
		System.out.println("-----------PESSOAS---CADASTRADAS-----------");
		
		System.out.printf ("| %15s | %4s | %5s | %6s | %11s| %4s | %4s | %23s | %10s | %20s | %10s | %10s |\n", "Nome", "Ano", "Idade", "Altura", "Pais", "Sigla do Pais", "Nome do Estado", "Sigla do Estado",
				"Nome da Cidade", "Nome da Rua", "Bairro", "Número da Casa");
		for(int i = 0; i < pessoas.size(); i++) {
			System.out.printf("| %15s | %4d | %5d | %6.2f | %10s | %4s | %15s | %4s | %23s | %10s | %20s | %10s | %10s |\n", 
					pessoas.get(i).getNome(),
					pessoas.get(i).getAnoDeNascimento(),
					pessoas.get(i).getIdade(),
					pessoas.get(i).getAltura(),
					pessoas.get(i).getnomeDoPais(),
					pessoas.get(i).getSiglaDoPais(),
					pessoas.get(i).getNomeDoEstado(),
					pessoas.get(i).getSiglaDoEstado(),
					pessoas.get(i).getNomeDaCidade(),
					pessoas.get(i).getRua(),
					pessoas.get(i).getBairro(),
					pessoas.get(i).getNumero(),
					pessoas.get(i).getComplemento());
		}
		return pessoas;
	}	
}