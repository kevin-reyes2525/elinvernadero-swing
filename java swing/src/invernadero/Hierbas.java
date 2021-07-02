package invernadero;

import javax.swing.JLabel;

public class Hierbas extends Planta implements Controlar {
	
	
	public Hierbas(String name, float altura, String color) {
		super(name, altura, color);
	
	}
	public void Reforzar() {
		System.out.print("refuerzo el sistema inmune");
	}
	void Manzanilla() {
		System.out.println("Manzanilla");
		
	}
	void Menta() {
		System.out.println("Menta");
	}

	void Boldo() {
		System.out.println("Boldo");

	}
	void Hinojo() {
		System.out.println("Hinojo");
	
	}
	void Anis() {
		System.out.println("Anis");
	}

}
