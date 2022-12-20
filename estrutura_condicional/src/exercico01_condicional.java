import java.util.Scanner;

public class exercico01_condicional {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		int x = sc.nextInt();
		
		if (x >= 0) {
			System.out.println("Nao Negativo");
		} else {
			System.out.println("Negativo");
		}
		sc.close();
		

	}

}
