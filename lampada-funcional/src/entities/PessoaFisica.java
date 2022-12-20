package entities;

import java.util.Objects;

public class PessoaFisica extends Empregado{

	private String CPF;

	public PessoaFisica(String name, String email, Double salario, String cPF) {
		super(name, email, salario);
		this.CPF = cPF;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		this.CPF = cPF;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(CPF);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaFisica other = (PessoaFisica) obj;
		return Objects.equals(CPF, other.CPF);
	}
	
	
	
	
}
