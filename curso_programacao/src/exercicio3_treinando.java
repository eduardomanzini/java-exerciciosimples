import java.util.Scanner;

public class exercicio3_treinando {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int diferenca = (a * b) - (c * d);
			
		System.out.println("Diferenca: " + diferenca);
		sc.close();
	}

}
