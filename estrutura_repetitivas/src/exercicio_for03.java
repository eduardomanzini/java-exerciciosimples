import java.util.Locale;
import java.util.Scanner;

public class exercicio_for03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		
		for (int i = 0; i < N; i++) {
			float nota1 = sc.nextFloat();
			float nota2 = sc.nextFloat();
			float nota3 = sc.nextFloat();
			float media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
			System.out.println(media);
		}
					
		sc.close();
	}

}
