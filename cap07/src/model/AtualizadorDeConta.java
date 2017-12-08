package model;


public class AtualizadorDeConta extends Conta {
	protected double saldoTotal = 0;
	protected double selic;
	protected double saldoAnterior;
	protected double saldoFinal;
	
	public AtualizadorDeConta(double selic) {
		this.selic= selic;
	}
	
	public void roda(Conta c) {
		c.atualiza(this.selic);
		this.atualizaSaldo(c.getSaldo());
	}
	
	public void atualizaSaldo(double valor) {
		this.saldoTotal += valor;
	}
	
	public double getSaldoTotal() {
		return this.saldoTotal;
	}
	
}
