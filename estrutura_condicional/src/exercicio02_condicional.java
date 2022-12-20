import java.util.Scanner;

public class exercicio02_condicional {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero");;
		int x = sc.nextInt();
		if ( x % 2 == 0) {
			System.out.println("Esse numero eh PAR");
		} else {
			System.out.println("Esse numero eh Impar");
		}
		
			
		sc.close();
		
	}

}
