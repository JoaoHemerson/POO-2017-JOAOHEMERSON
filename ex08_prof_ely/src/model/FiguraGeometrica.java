package model;

public abstract class FiguraGeometrica {
	public int lados;
	public String nome;
	public double base;
	public double altura;

	public void criaFiguraGeometrica(String nome, int qtdeDeLados, double altura, double base) {
		this.nome=nome;
		this.lados=qtdeDeLados;
		this.altura = altura;
		this.base = base;
	}
	
	public abstract double calcularArea();
	
	public String toString() {
		return "A figura é um " + this.nome;
	}
	
	
}
