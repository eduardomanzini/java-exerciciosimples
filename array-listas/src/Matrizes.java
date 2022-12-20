import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for (int i =0; i<n; i++) {
			for(int j = 0; j<n;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal");
		for (int i = 0; i<n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		int contador = 0;
		
		for (int i =0; i<n; i++) {
			for(int j = 0; j<n;j++) {
				if(mat[i][j] < 0) {
					contador = contador + 1;
				}
			}
		}
		System.out.println();
		System.out.print("Negative numbers " + contador);
		
		sc.close();
	}

}
