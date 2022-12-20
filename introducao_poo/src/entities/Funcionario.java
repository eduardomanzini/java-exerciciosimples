package entities;

public class Funcionario {
	
		public String nome;
		public double salario;
		public double taxa;
		
	
	 public double netSalary() {
		 return salario - taxa;
	 }

	 public void increaseSalary(double percentage) {
		salario += salario * percentage / 100.0;
		
	 }
	 
	 public String toString() {
		 return nome + ", $ " + String.format("%.2f", netSalary());
	 }
	 
}
