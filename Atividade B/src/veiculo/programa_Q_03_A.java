package veiculo;

public class programa_Q_03_A {

	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo("Gol", "VW");
		
		System.out.print("Veiculo modelo: "+ veiculo.GetModelo());
		System.out.println("\n");
		System.out.println("Fabricado por: "+ veiculo.GetMontadora());
		
	}
}

