import java.util.Scanner;

public class swithcase_treinando {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String dia;
		
		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda-feira";
			break;
		case 3:
			dia = "ter�a-feira";
			break;
		case 4:
			dia = "qaurta-feira";
			break;
		case 5:
			dia = "quinta-feira";
			break;
		case 6:
			dia = "sexta-feira";
			break;
		case 7:
			dia = "sabado";
			break;
		default:
			dia = "valor invalido";
			break;
		}	
		
		System.out.println("o dia eh: " + dia);
		sc.close();

	}

}
