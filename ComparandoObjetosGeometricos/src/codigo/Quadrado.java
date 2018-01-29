package codigo;

public class Quadrado implements ObjetoGeometrico {
	private double lado;

	public Quadrado() {

	}

	public Quadrado(double lado) {
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double newLado) {
		lado = newLado;
	}

	public double getArea() {
		return lado * lado;
	}

	public String toString() {
		return "Square " + lado;
	}

}
