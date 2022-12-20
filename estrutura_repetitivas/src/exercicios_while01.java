import java.util.Scanner;

public class exercicios_while01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha = 0;
		
		while (senha != 2002) {
			System.out.println("Senha invalida");
			senha = sc.nextInt();
			
		}
		
		System.out.println("Acesso Permitido");
		
		
		sc.close();
	}

}
