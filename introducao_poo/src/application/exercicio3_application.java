package application;

import java.util.Locale;
import java.util.Scanner;

import entities.estudante;

public class exercicio3_application {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		estudante nota = new estudante();
		
		System.out.println("Digite o nome e as 3 notas: ");
		nota.nome = sc.nextLine();
		nota.nota1 = sc.nextDouble();
		nota.nota2 = sc.nextDouble();
		nota.nota3 = sc.nextDouble();		
		
		
		System.out.printf("FINAL GRADE: %.2f\n", nota.notaFinal());
		
		if (nota.notaFinal() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("Missing %.2f points\n", nota.missingPoints());
		} else {
			System.out.println("PASS");
		}
		
	
	}

}
