package application;

import java.util.Locale;
import java.util.Scanner;

import entities.calculador;

public class program2 {

	
	public static void main(String[] args) {

	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = calculador.circumference(radius);
		double v = calculador.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calculador.PI);
		sc.close();
	}

	
}