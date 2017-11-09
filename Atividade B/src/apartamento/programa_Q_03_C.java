package apartamento;

public class programa_Q_03_C {
	public static void main(String[] args) {
		Apartamento apartamento = new Apartamento("Joao Hemerson Lima Oliveira",150000);
		
		System.out.println("O apartamento pertence a: "+ apartamento.GetProprietario());
		System.out.println("\n");
		System.out.println("O valor do apartamento e: "+ apartamento.GetValor());
	}
	
	
}
