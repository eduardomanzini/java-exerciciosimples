package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitites.Contribuintes;
import entitites.PessoaFisica;
import entitites.PessoaJuridica;

public class Program7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuintes> list = new ArrayList<>();
		
		System.out.print("Numeros de Contribuintes: ");
		int n = sc.nextInt();
		
		
		for (int i=1; i<=n; i++) {
			System.out.println("Contribuinte #" + i + " data");
			System.out.print("Fisica ou Juridica (f/j)? ");
			char tipo = sc.next().charAt(0);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			sc.nextLine();
			System.out.print("Renda Anual: ");
			Double rendaAnual = sc.nextDouble();
			if( tipo == 'f') {
				System.out.print("Gasto com saude: ");
				Double gastoSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
			}
			else {
				System.out.print("Numberos de funcionarios: ");
				int numeroFuncionarios = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
				
			}
		}
		
		System.out.println();
		System.out.println("Relatorio: ");
		
		for (Contribuintes tipo : list) {
			System.out.println(tipo.getNome() + " $ " + String.format("%.2f", tipo.impostoPago()));
		}
		
		
		double soma = 0.0;
		
		for (Contribuintes tipo : list) {
			soma += tipo.impostoPago();
			
		}
		
		System.out.println("Total: ");
		System.out.println(String.format("%.2f", soma));
		
		
		
		
		sc.close();
	}

}
