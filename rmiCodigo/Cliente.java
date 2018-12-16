import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.*;
import java.util.Scanner;

public class Cliente {

	private static ExerInterface exerInterface;
	private static Exer2Interface exer2Interface;

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		
		Scanner sc = new Scanner(System.in);

		//Escolher o exercicio da lista		
		System.out.print("Exercicio da lista: ");
		int exercicio = sc.nextInt();

		//Pegar informacoes do funcionario
		Pessoa pessoa = infos(exercicio);

		//Chamada para o servico
		switch(exercicio) {
			case 1:
				pessoa = servicoReajusteSalarial(pessoa, exerInterface);

				System.out.print("\n\nNome: " + pessoa.getNome() + "\nSalario: " + pessoa.getSalario());
				break;
			case 2:
				pessoa = servicoMaioridade(pessoa, exer2Interface);				

				if (pessoa.getMaioridade()) {
					System.out.print("\n" + pessoa.getNome() + " eh de maioridade");
				} else {
					System.out.print("\n" + pessoa.getNome() + " nao eh de maioridade");
				}
				
				break;
		}
		
	}

	//Fazer chamada para os servicos
	public static Pessoa servicoReajusteSalarial(Pessoa pessoa, ExerInterface exerInterface) throws MalformedURLException, RemoteException, NotBoundException{
		exerInterface = (ExerInterface) Naming.lookup("ReajusteSalarial");
		pessoa = exerInterface.ajusteSalarial(pessoa);

		return pessoa;
	}

	public static Pessoa servicoMaioridade(Pessoa pessoa, Exer2Interface exer2Interface) throws MalformedURLException, RemoteException, NotBoundException{
		exer2Interface = (Exer2Interface) Naming.lookup("Maioridade");
		pessoa = exer2Interface.maioridade(pessoa);

		return pessoa;
	}

	//Pegar informações do usuario na tela
	public static Pessoa infos(int exercicio) {
		Pessoa pessoa = new Pessoa();
		Scanner sc = new Scanner(System.in);

		System.out.print("Nome do funcionario: ");
		String nome = sc.nextLine();
		pessoa.setNome(nome);

		switch(exercicio) {
			//exercicio 1
			case 1:
				System.out.print("Cargo: ");
				String cargo = sc.nextLine();
				pessoa.setCargo(cargo);

				System.out.print("Salario: ");
				float salario = sc.nextFloat();
				pessoa.setSalario(salario);
				break;

			//exercicio 2
			case 2:
				System.out.print("Sexo: ");
				String sexo = sc.nextLine();
				pessoa.setSexo(sexo);

				System.out.print("Idade: ");
				int idade = sc.nextInt();
				pessoa.setIdade(idade);
				break;
		}

		return pessoa;
	}
}
