package invernadero;

public interface Aportar {
	public default void Aporta() {
		System.out.println("Aporto vitaminas y minerales");
	}

}
