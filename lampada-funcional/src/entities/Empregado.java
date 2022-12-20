package entities;

import java.util.Objects;

public abstract class Empregado{

	private String name;
	private String email;
	private Double salario;
	

	public Empregado(String name, String email, Double salario) {
		super();
		this.name = name;
		this.email = email;
		this.salario = salario;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Double getSalario() {
		return salario;
	}


	public void setSalario(Double salario) {
		this.salario = salario;
	}


	@Override
	public int hashCode() {
		return Objects.hash(email, name, salario);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empregado other = (Empregado) obj;
		return Objects.equals(email, other.email) && Objects.equals(name, other.name)
				&& Objects.equals(salario, other.salario);
	}
	
	
	
	
	
}
