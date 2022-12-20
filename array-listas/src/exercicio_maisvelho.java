import java.util.Scanner;

import entities.Pessoas;

public class exercicio_maisvelho {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar: ");
		int n = sc.nextInt();
		
	
		
		Pessoas vetor[] = new Pessoas[n];
		
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Dados da pra %d pessoa\n", i+1);
			System.out.print("nome: ");
			String name = sc.nextLine();
			sc.nextLine();	
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			vetor[i] = new Pessoas(name, idade);
		}
		int maioridade, posicaomaior;
		
		maioridade = vetor[0].getIdade();
	    posicaomaior = 0;

	    for (int i=1; i<n; i++) {
	        if ( vetor[i].getIdade() > maioridade) {
	            maioridade = vetor[i].getIdade();
	            posicaomaior = i;
	        }
	    }
		
	    System.out.printf("PESSOA MAIS VELHA: %s\n", vetor[posicaomaior].getIdade());	
		System.out.printf("tamanho do vetor: %d", vetor.length);
	    
		
		sc.close();
	}

}
