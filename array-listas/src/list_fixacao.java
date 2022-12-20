import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.funcionario_fixacao;

public class list_fixacao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		List<funcionario_fixacao> list = new ArrayList<>();
		
		System.out.print("how many employes: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Emplyoee " + (i+1));
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.println("Já existe esse codigo");
				id = sc.nextInt();
			}
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			Double salario = sc.nextDouble();
			funcionario_fixacao emp = new funcionario_fixacao(id, nome, salario);
			
			list.add(emp);
		}
		
		
		funcionario_fixacao ze = new funcionario_fixacao();
		ze.setId(800);
		ze.setName("renan");
		ze.setSalario(8500.00);
		list.add(ze);
		
		
		
		System.out.print("Enter the employee id that will have salary");
		int idsalario = sc.nextInt();
		funcionario_fixacao emp = list.stream().filter(x -> x.getId() == idsalario).findFirst().orElse(null);
		
		
		if ( emp == null ) {
			System.out.println("Nao existe esse id");
		} else {
			System.out.print("Enter the porcentagem: ");
			double porcentagem = sc.nextDouble();
			emp.novoSalario(porcentagem);
		}
		
		for (funcionario_fixacao x : list ) {
			System.out.println(x);
		}
		
		sc.close();
	}

	
	public static boolean hasId(List<funcionario_fixacao> list, int id) {
		funcionario_fixacao emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
	
}
