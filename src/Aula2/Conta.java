package Aula2;

public class Conta {
	int numero;
	String dono;
	double saldo;
	double limite;
	double salario;
	// Outros atributos 
	
	
	public Conta(double saldo, String dono) {
		this.saldo = saldo;
		this.dono = dono;
	}
	
	void saca (double quantidade) {
		double novoSaldo = saldo - quantidade;
		saldo = novoSaldo;
	}
	// Outros atributos e metodos 
	
	void depositar (double quantidade) {
		saldo += quantidade;
	}
	boolean saca1(double valor) {
		if (this.saldo < valor) {
			return false;
		}
		else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}
	
	
	
}