import java.util.Locale;
import java.util.Scanner;

public class exercicio2_treinando {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double raio = sc.nextDouble();
		double pi = 3.14159;
		double a = pi * Math.pow(raio, 2.0);
		
		
		System.out.printf("AREA = %.4f", a);
		
		sc.close();
	}

}
