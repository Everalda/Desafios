package codigo;

public class Triangulo extends ObjetoGeometrico {
	private double ladoA;
	private double ladoB;
	private double ladoC;

	public Triangulo() {

	}

	public Triangulo(double a, double b, double c) {
		this.ladoA = a;
		this.ladoB = b;
		this.ladoC = c;
	}

	public double getLadoA() {
		return ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public double getLadoC() {
		return ladoC;
	}

	public void setLadoA(double newLadoA) {
		ladoA = newLadoA;
	}

	public void setLadoB(double newLadoB) {
		ladoB = newLadoB;
	}

	public void setLadoC(double newLadoC) {
		ladoC = newLadoC;
	}

	public double getPerimetro(double a, double b, double c) {
		return (a + b + c) / 2;
	}

	double p = getPerimetro(ladoA, ladoB, ladoC);

	@Override
	public double getArea() {

		return Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));
	}
	public String toString(){
		return "Triangle "+ ladoA +" "+ ladoB +" "+ ladoC;
	}
}
