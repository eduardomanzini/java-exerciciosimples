package application;

import java.util.Locale;
import java.util.Scanner;

import entities.cliente;

public class Program_banco {

	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		cliente cliente;
		
		System.out.print("Enter account number: ");
		int numeroConta = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Is ther na initial deposit (y/n)");
		char res = sc.next().charAt(0);
		if (res == 'y') {
			System.out.print("Enter inital deposit value: ");
			double inicialDeposit = sc.nextDouble();
			cliente = new cliente(numeroConta, nome, inicialDeposit);
			System.out.println(cliente);
		} else {
			cliente = new cliente(numeroConta, nome);
			System.out.println(cliente);
		}
		
		
		
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposito = sc.nextDouble();
		cliente.deposito(deposito);
		System.out.println(cliente);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		cliente.saque(saque);
		System.out.println(cliente);
		
		
		sc.close();
	}

}
