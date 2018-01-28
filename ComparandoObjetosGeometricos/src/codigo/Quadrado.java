package codigo;

public class Quadrado extends ObjetoGeometrico {
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

	@Override
	public double getArea() {
		return lado * lado;
	}

	public String toString() {
		return "Square " + lado;
	}

}
