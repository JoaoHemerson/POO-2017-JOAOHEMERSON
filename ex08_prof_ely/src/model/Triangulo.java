package model;

public class Triangulo extends FiguraGeometrica{
	
	
	@Override
	public double calcularArea() {
		
		double area = (base*altura) / 2;
		return area; 
	}

	
	
	
}
