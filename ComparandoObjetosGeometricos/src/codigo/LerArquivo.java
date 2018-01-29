package codigo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LerArquivo {
	private static BufferedReader origem;
	ArrayList<String> dados = new ArrayList<String>();
	public ArrayList<String> lerArquivo(String[] args) throws IOException{
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
		return dados;
	}
}
