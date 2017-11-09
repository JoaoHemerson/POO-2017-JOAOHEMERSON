
public class programa_Q_02_B {
		public static void main(String[] args) {
			Conta conta = new Conta("Joao",20);
			
			System.out.println(conta.GetTitular());
			
			System.out.println(conta.Saldo());
			conta.Deposito(100);
			
			System.out.println("Novo Saldo "+ conta.Saldo());
			
			conta.Saque(30);
			
			System.out.println("Novo Saldo "+ conta.Saldo());
		}
	}


