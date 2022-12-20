import java.util.Locale;
import java.util.Scanner;

public class exercicio05_condicional {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o codigo: ");
		int x = sc.nextInt();
		System.out.println("Digite a quantidade: ");
		int y = sc.nextInt();
		
		
		double cachorro = y * 4;
		double xsalada = y * 4.5;
		double xbacon = y * 5;
		double torrada = y * 2;
		double refri = y * 1.50;
		
			
		
		if (x == 1) {		 
			System.out.println("total:  " + cachorro);
		}else if (x == 2) {
			System.out.println("total:  " + xsalada);
		} else if (x == 3) {
			System.out.println("total:  " + xbacon);
		} else if (x == 4) {
			System.out.println("total:  " + torrada);
		} else if (x == 5) {
			System.out.println("total:  " + refri);
		} else {
			System.out.println("Numero Invalido");
		}
		
		
		
		
		sc.close();
	}

}
