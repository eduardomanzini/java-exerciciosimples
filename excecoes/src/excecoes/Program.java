package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		method1();
		
		System.out.println("Ender of program");
		
		
	}

	public static void method1() {
		System.out.println("***METHOD1 STAR***");
		method2();
		System.out.println("***METHOD1 END***");
	}
	
	
	public static void method2() {
		
		
		System.out.println("***METHOD2 STAR***");
		Scanner sc = new Scanner(System.in);
		
		try {
		String[] vect = sc.nextLine().split(" ");
		int position = sc.nextInt();
		System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid position!");
			e.printStackTrace();
			sc.next();
		}
		catch (InputMismatchException e ) {
			System.out.println("Input error: ");
		}
		sc.close();
		System.out.println("***METHOD2 END***");
	}
	
	
}
