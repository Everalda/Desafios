package codigo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	private static BufferedReader origem;
	private static ObjetoGeometrico menor = null;
	private static ObjetoGeometrico maior = null;
	private static ObjetoGeometrico temp = null;

	public static void main(String[] args) throws IOException {

		FileReader ler = new FileReader(new File(args[0]));
		origem = new BufferedReader(ler);
		String linha = null;
		ArrayList<String> dados = new ArrayList<String>();

		while ((linha = origem.readLine()) != null) {
			try {
				dados.add(linha);
			} catch (Exception e) {
				System.out.println("Erro! Nao consegui ler o arquivo!");
			}
		}

		for (String str : dados) {

			temp = InterpretadorEntrada.interpreta(str);
			if (menor == null || menor.getArea()<temp.getArea()) {
				menor = temp; 
			}
			if (maior == null || maior.getArea()>temp.getArea()) {
				maior = temp;
			}

		}
		System.out.println(menor.toString());
		System.out.println(maior.toString());
	}
}
