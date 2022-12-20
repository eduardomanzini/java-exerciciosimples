import java.util.Scanner;

public class exercicio04_condicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hora inicial");
		int x = sc.nextInt();
		System.out.println("Hora final");
		int y = sc.nextInt();
		
		int duracao;
		
		if (x < y) {
			duracao = y - x;
		} else {
			duracao = 24 - x + y;
		}
		
		
		System.out.println("O jogo durou "+ duracao + " Horas(s)");
		
		
		
	  sc.close();
	}

}
