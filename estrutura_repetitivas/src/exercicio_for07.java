import java.util.Scanner;

public class exercicio_for07 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		
		for (int i = 1; i <= x; i++) {
			int num1 = i ;
			int num2 = i * i;
			int num3 = i * i * i;
			System.out.printf("%d %d %d\n", num1, num2, num3);	
			
		}
		
		
		sc.close();
	}	
}
