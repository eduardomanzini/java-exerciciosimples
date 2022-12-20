package entities;

public class funcionario_fixacao {

	
	private Integer id;
	private String name;
	private Double salario;
	
	
	public funcionario_fixacao() {	
	}
	
	
	public funcionario_fixacao(Integer id, String name, Double salario) {
		this.id = id;
		this.name = name;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	
	public void novoSalario(double porcentagem) {
		this.salario += salario * porcentagem / 100;
	}
	
	@Override
	public String toString() {
		return "funcionario com id=" + id + ", name=" + name + ", salario= " + String.format("%.2f", salario);
	}
	
	
	
	
	
	
}
