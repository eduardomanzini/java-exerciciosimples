import java.util.Locale;
import java.util.Scanner;

public class exercicio4_treinando {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num, horas;
		double extra, salario;
		
		num =  sc.nextInt();
		horas = sc.nextInt();
		extra = sc.nextDouble();
		salario = horas * extra;
		
		System.out.println("NUMBER = " + num);
		System.out.printf("Salario: %.2f", salario);
		
		
	
		sc.close();
		
	}

}
