import java.util.Scanner;

public class exercicio_for04 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			double um = sc.nextDouble();
			double dois = sc.nextDouble();
			
			if ( dois == 0 ) {
				System.out.println("Divisao impossivel");
			} else {
				double res = um / dois;
				System.out.println(res);
			}			
			
		}
	
		sc.close();
	}

}
