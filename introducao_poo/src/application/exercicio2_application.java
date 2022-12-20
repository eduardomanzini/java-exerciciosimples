package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class exercicio2_application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario nome = new Funcionario();
		
		System.out.println("Name: ");
		nome.nome = sc.nextLine();
		System.out.println("Gross Salary: ");
		nome.salario = sc.nextDouble();
		System.out.println("Tax: ");
		nome.taxa = sc.nextDouble();
		
		
		System.out.println("Emprego: " + nome);
		
		System.out.println("Wich percentage to increase salary?");
		double percentage = sc.nextDouble();
		nome.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + nome);
		sc.close();
		
		
		
		
		
		sc.close();
	}

}
