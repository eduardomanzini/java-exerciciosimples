import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Testandoo;

public class Testando {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		
		List<Testandoo> list = new ArrayList<>();
		
		Testandoo bruno = new Testandoo();
		Testandoo ze = new Testandoo();
		
	
		bruno.setNome("Joao");
		bruno.setIdade(18);
		
		ze.setNome("ze");
		ze.setIdade(20);
		
		list.add(bruno);
		list.add(ze);
		
		
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getNome());
			System.out.println(list.get(i).getIdade());
		}
		
		
		sc.close();	
	}

}
