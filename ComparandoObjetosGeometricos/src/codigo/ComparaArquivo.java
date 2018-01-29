package codigo;

import java.util.ArrayList;

public class ComparaArquivo {
	private static ObjetoGeometrico menor = null;
	private static ObjetoGeometrico maior = null;
	private static ObjetoGeometrico temp = null;

	public void comparaMenorObjeto(ArrayList<String> dados) {

		for (String str : dados) {
			temp = InterpretadorEntrada.interpreta(str);
			if (menor == null || menor.getArea() < temp.getArea()) {
				menor = temp;
			}
		}
		System.out.println("Menor Area: " + menor.toString());
	}

	public void comparaMaiorObjeto(ArrayList<String> dados) {
		for (String str : dados) {
			temp = InterpretadorEntrada.interpreta(str);
			if (maior == null || maior.getArea() > temp.getArea()) {
				maior = temp;
			}
		}
		System.out.println("Maior Area: " + maior.toString());
	}

}
