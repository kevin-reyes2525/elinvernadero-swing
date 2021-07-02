package invernadero;

public abstract class Planta {
	
	public String name;
	public float altura;
	public String color;
	
	public Planta(String name, float altura, String color) {
		this.name= name;
		this.altura= altura;
		this.color= color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}
	public float getaltura() {
		return altura;
	}
	public void setaltura(float altura) {
		this.altura= altura;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color= color;
	}
	public void Oxigenar() {
		System.out.print("Oxigenan");
	}
	public void Alimentar() {
		System.out.print("Alimentan");
	}

}
