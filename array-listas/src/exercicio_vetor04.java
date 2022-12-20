import java.util.Scanner;

public class exercicio_vetor04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] vetor = new int [n];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		
		int soma = 0;
		
		System.out.printf("NUMEROS PARES: \n");
		for(int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				soma = soma + 1;
				System.out.printf("%d ", vetor[i]);
			}		
		}
		
		System.out.println();
		System.out.printf("Quantidade de pares = %d" ,  soma);
		
		
		sc.close();
	}

}
