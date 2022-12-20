package entities;

public class cliente {

	private int numeroConta;
	private String nome;
	private double valor;
	
	public cliente(int numeroConta, String nome, double inicialDeposito) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		deposito(inicialDeposito);
	}
	
	public cliente(int numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nome = nome;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void deposito(double deposito) {
		this.valor += deposito;
	}
	
	public void saque(double saque ) {
		this.valor -= saque + 5.0;
	}

	
	public String toString() {
		return "cliente [numeroConta=" + numeroConta + ", nome=" + nome + ", valor=" + String.format("%.2f", valor) + "]";
	}
	
	
	
}
