package codigo;

public class Circulo extends ObjetoGeometrico {
	private double raio;
	final double PI=3.1415;

	public Circulo() {

	}

	public Circulo(double raio) {
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double newRaio) {
		this.raio = newRaio;
	}

	public double getArea() {
		
		return raio*raio*PI;
	}
	
	public String toString(){
		return "Circle "+ raio;
	}


}
