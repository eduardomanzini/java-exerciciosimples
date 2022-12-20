import java.util.Scanner;

import entities.EstudanteQuartos;

public class exercicio_quartosvazios {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		EstudanteQuartos[] quarto = new EstudanteQuartos[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		
		for( int i = 0; i < n; i++) {
			System.out.printf("Rent #%d:\n", i+1);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			quarto[room] = new EstudanteQuartos(name, email);
		}
		
		System.out.println("busy rooms");
		for (int i = 0; i < 10; i++) {
			if ( quarto[i] != null) {
				System.out.printf("%d : %s\n", i, quarto[i]);
			}
		}
		
		
		
		
		sc.close();
	}

}
