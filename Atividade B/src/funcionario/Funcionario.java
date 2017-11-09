package funcionario;

public class Funcionario {
	public String nome;
	public String cargo;
	private String cpf;
		

	public Funcionario(String nome, String cargo, String doc) {
		Nome(nome);
		Cargo(cargo);
		Cpf(doc);
	}
	public void Nome(String nome) {
		this.nome = nome;
	}
	public void Cargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void Cpf(String doc) {
		cpf = doc;
	}
	public String GetNome() {
		return nome;
	}
	public String getGargo() {
		return cargo;
	}
	public String getCpf() {
		return cpf;
	}
}
