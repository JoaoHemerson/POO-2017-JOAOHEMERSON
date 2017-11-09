package veiculo;

public class Veiculo {
	
	private String modelo;
	private String montadora;
	

public Veiculo(String modelo, String montadora) {
	Modelo(modelo);
	Montadora(montadora);
}
public void Modelo(String nome) {
	modelo = nome;
}
public void Montadora(String mont) {
	montadora = mont;
}
public String GetModelo() {
	return modelo;
}
public String GetMontadora() {
	return montadora;
}
}

