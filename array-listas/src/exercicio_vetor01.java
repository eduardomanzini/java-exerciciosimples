import java.util.Scanner;

public class exercicio_vetor01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Quantos numeros voce vai digitar");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for ( int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um numero: ");
			vetor[i] = sc.nextInt();		
		}
		
		System.out.println("Numero Negativos: ");
		for (int i = 0; i <vetor.length; i++) {
			if (vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
		}
		
		
		sc.close();
	}

}
