package model;

public abstract class Conta {
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
	
	abstract void atualiza(double taxa);

}
