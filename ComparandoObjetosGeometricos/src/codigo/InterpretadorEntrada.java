package codigo;

public class InterpretadorEntrada {
	
	public static ObjetoGeometrico interpreta(String str) {
		String[] linha = str.split(" ");
	
		for (String s : linha) {
			if (s.contains("circle")) {
				return new Circulo(
						Integer.parseInt(linha[1]));
			}
			if (s.contains("rectangle")) {
				return new Retangulo(
						Integer.parseInt(linha[1]), 
						Integer.parseInt(linha[2]));
			}
			if (s.contains("square")) {
				return new Quadrado(
						Integer.parseInt(linha[1]));
			}
			if (s.contains("triangle")) {
				return new Triangulo(
						Integer.parseInt(linha[1]), 
						Integer.parseInt(linha[2]),
						Integer.parseInt(linha[3]));
			}

		}
		
		return null;

	}

	

}
