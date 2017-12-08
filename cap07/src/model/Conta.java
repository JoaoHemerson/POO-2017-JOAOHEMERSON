package model;

public class Conta {
	protected double saldo;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(valor <= getSaldo()) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void atualiza(double taxa) {
		this.saldo += this.saldo*taxa;
	}

}
