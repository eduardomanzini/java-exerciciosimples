import java.util.Locale;
import java.util.Scanner;

public class exercicio_vetor02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar: ");
		int n = sc.nextInt();
		double[] vetor = new double[n];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
			
		}
		
		System.out.print("Valores = ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%.1f ", vetor[i]);
		}
		
		
		System.out.println();
		double soma = 0.0;
		double media;
		
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		
		media = soma / n;
		
		System.out.printf("soma %.2f\n", soma);
		System.out.printf("media %.2f", media);
		
		
		
		sc.close();
	}

}
