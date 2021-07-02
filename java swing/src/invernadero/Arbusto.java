package invernadero;

import javax.swing.JLabel;

public class Arbusto extends Planta implements Aportar {
	
	public Arbusto(String name, float altura, String color) {
		super(name, altura, color);
	
	}
	public void Aporta() {
		System.out.print("Aporto vitaminas y minerales");
	}
	void Achiote() {
		System.out.println("Achiote");
		
	}
	void Cereza() {
		System.out.println("Cereza");
	}

	void Limon() {
		System.out.println("Limon");

	}
	void Guayaba() {
		System.out.println("Guayaba");
	
	}
	void Ponsigue() {
		System.out.println("ponsigue");
	}

}
