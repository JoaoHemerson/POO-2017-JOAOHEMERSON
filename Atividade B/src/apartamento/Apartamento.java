package apartamento;

public class Apartamento {	
	
	private String proprietario;
	private double valor;
		

	public Apartamento(String dono, double numero) {
		Proprietario(dono);
		Valor(numero);
	}
	public void Proprietario(String nome) {
		proprietario = nome;
	}
	public void Valor(double valor) {
		this.valor = valor;
	}
	public String GetProprietario() {
		return proprietario;
	}
	public double GetValor() {
		return valor;
	}
}



