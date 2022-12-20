package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Aluno;

public class ProgramSetFixacao {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
	Set<Aluno> list = new HashSet<>();
	
	
	System.out.print("How many students for course A?");
	int quantidade =  sc.nextInt();
	
	for (int i = 0; i < quantidade; i++) {
		int id = sc.nextInt();
		list.add(new Aluno(id));	
	}
	
	System.out.print("How many students for course B?");
	quantidade =  sc.nextInt();
	
	for (int i = 0; i < quantidade; i++) {
		int id = sc.nextInt();
		list.add(new Aluno(id));	
	}
	
	System.out.print("How many students for course c?");
	quantidade =  sc.nextInt();
	
	for (int i = 0; i < quantidade; i++) {
		int id = sc.nextInt();
		list.add(new Aluno(id));	
	}
	
	
	System.out.println("Total students: " + list.size());
	
	
	
	
	
	
	
	
	
	
	
	
	 sc.close();
	}

}
