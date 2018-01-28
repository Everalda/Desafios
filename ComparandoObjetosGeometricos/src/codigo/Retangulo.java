package codigo;

public class Retangulo extends ObjetoGeometrico {
	private double comprimento;
	private double altura;

	public Retangulo() {

	}

	public Retangulo(double comprimento, double altura) {
		this.comprimento = comprimento;
		this.altura = altura;
	}

	public double getaltura() {
		return altura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setAltura(double newAltura) {
		altura = newAltura;
	}

	public void setComprimento(double newComprimento) {
		comprimento = newComprimento;
	}

	@Override
	public double getArea() {

		return comprimento * altura;
	}
	
	public String toString(){
		return "Rectangule "+ comprimento + altura;
	}

}
