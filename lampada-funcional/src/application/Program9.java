package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Funcionario;

public class Program9 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter full file path: ");
		String path = sc.nextLine();
		System.out.println("Enter salary: ");
		Double salario = sc.nextDouble();
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			List<Funcionario> list = new ArrayList<>();
			
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Funcionario(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();	
			}
			
			
			System.out.println("Email of people whose salary is more than " + salario);
			
			List<String> email = list.stream()
					.filter(p -> p.getSalario() > salario)
					.map(p -> p.getEmail())
					.sorted()
					.collect(Collectors.toList());
					
			email.forEach(System.out::println);		
			
			
			double total = list.stream()
					.filter(p -> p.getName().charAt(0) == 'M')
					.map(p -> p.getSalario())
					.reduce(0.0, (x,y) -> x + y);
					
			
			System.out.println("Sum of salary of people whose name starts with 'M': " + total);
			
		} catch (IOException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		
		
		
		
		
		
		sc.close();
	}

}
