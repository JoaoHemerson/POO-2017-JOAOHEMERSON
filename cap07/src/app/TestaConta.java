package app;
import model.*;

public class TestaConta {
	public static void main(String[] args) {
//			Conta c = new ContaCorrente();
//			ContaCorrente cc = new ContaCorrente();
//			ContaPoupanca cp = new ContaPoupanca();
			
			ContaCorrente[] contascorrentes;
			contascorrentes = new ContaCorrente[10];
			
			ContaPoupanca[] contaspoupanca;
			contaspoupanca = new ContaPoupanca[10];
			
			contascorrentes[0].deposita(1000);
			contaspoupanca[0].deposita(2000);
			
			
			
//			cc.atualiza(0.01);
//			cp.atualiza(0.01);
			contascorrentes[0].atualiza(0.01);
			contaspoupanca[0].atualiza(0.01);
			
//			System.out.println(c.getSaldo());
//			System.out.println(cc.getSaldo());
//			System.out.println(cp.getSaldo());
			

			
			System.out.println(contascorrentes[0].getSaldo());
			System.out.println(contaspoupanca[0].getSaldo());
			
			AtualizadorDeConta adc = new AtualizadorDeConta(0.01);
			
//			adc.roda(c);
//			adc.roda(cc);
//			adc.roda(cp);
			adc.roda(contascorrentes[0]);
			adc.roda(contaspoupanca[0]);
			
//			System.out.println("Saldos Atualizados");
//			System.out.println(c.getSaldo());
//			System.out.println(cc.getSaldo());
//			System.out.println(cp.getSaldo());
			System.out.println("Saldos Atualizados");
			
			System.out.println(contascorrentes[0].getSaldo());
			System.out.println(contaspoupanca[0].getSaldo());
			System.out.println("***************************");
			System.out.println("Saldo Total " + adc.getSaldoTotal());
									
			
		}

}
