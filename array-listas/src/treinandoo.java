import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class treinandoo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Client a , b, c;
		
		a = new Client();
		b = new Client();
		c = new Client();
		
		
		a.nome = sc.nextLine();
		a.idade = sc.nextInt();
		sc.nextLine();
		b.nome = sc.nextLine();	
		b.idade = sc.nextInt();
		sc.nextLine();
		c.nome = sc.nextLine();
		c.idade =sc.nextInt();
		
		
		System.out.println(a.nome1());
		
		sc.close();
	}

}
