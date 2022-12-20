import java.util.Scanner;

public class exercicio03_condicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int x = sc.nextInt();
		System.out.println("Digite outro numero");
		int y = sc.nextInt();
		
		if ( x % y == 0 || y % x == 0) {
			System.out.println("Esse numero é multiplo");
		} else {
			System.out.println("Esse numero nao é multiplo");
		}

			
		sc.close();
	}

}
