
public class Conta {
	//declara os atributos da conta
	private String titular;
	private double saldo=0;
	

// inicia a conta com o titular e saldo inicial	
public Conta(String titular, double valor) {
	SetTitular(titular);
	Deposito(valor);
	
}
//mostra o titular
public void SetTitular(String nome) {
	titular = nome;
	
}
public String GetTitular() {
	return titular;
}
public void Deposito(double valor) {
	saldo += valor;
}
public double Saldo() {
	return saldo;
}
public boolean Saque(double valor) {
	
	if (valor <= Saldo()) {
		saldo -= valor;
	return true;
	}
	return false;
}

}
