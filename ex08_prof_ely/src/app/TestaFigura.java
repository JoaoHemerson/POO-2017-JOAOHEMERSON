package app;

import model.FiguraGeometrica;
import model.Triangulo;

public class TestaFigura {
	public static void main(String[] args) {
		
		FiguraGeometrica f = new Triangulo();
		
		f.criaFiguraGeometrica("triangulo", 3, 4, 2);
		System.out.println(f.toString());
		System.out.println("Sua area e " + f.calcularArea());
		
		
	}

}
