package invernadero;

import javax.swing.JLabel;

public class Mata extends Planta implements Aromatizar {
	
	public Mata(String name, float altura, String color) {
		super(name, altura, color);
	
	}
	public void Aromatiza() {
		System.out.print("aromatizo y saborizo comidas");
	}
	void Romero() {
		System.out.println("Romero");
		
	}
	void Tomillo() {
		System.out.println("Tomillo");
	}

	void Oregano() {
		System.out.println("Oregano");

	}
	void Eneldo() {
		System.out.println("Eneldo");
	
	}
	void Cilantro() {
		System.out.println("Cilantro");
	}

}
