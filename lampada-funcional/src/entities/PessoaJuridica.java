package entities;

import java.util.Objects;

public class PessoaJuridica extends Empregado {

	private String CNPJ;


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(CNPJ);
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
		PessoaJuridica other = (PessoaJuridica) obj;
		return Objects.equals(CNPJ, other.CNPJ);
	}


	public PessoaJuridica(String name, String email, Double salario, String cNPJ) {
		super(name, email, salario);
		this.CNPJ = cNPJ;
	}


	public String getCNPJ() {
		return CNPJ;
	}


	public void setCNPJ(String cNPJ) {
		this.CNPJ = cNPJ;
	}

	

	

	
}
