package entitites;

public class PessoaFisica extends Contribuintes {

	private Double gastoSaude;
	
	
	public PessoaFisica() {
		super();
	}
	
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}


	public Double getGastoSaude() {
		return gastoSaude;
	}


	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}


	@Override
	public double impostoPago() {
		if(getRendaAnual() < 20000) {
		   return (getRendaAnual() * 0.15) - (gastoSaude * 0.5);
		} else {
			return (getRendaAnual() * 0.25) - (gastoSaude * 0.5);
		}	
		
	} 

}

