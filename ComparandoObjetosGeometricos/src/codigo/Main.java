package codigo;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		LerArquivo arquivo = new LerArquivo();
		ComparaArquivo comp = new ComparaArquivo();
		comp.comparaMenorObjeto(arquivo.lerArquivo(args));
		comp.comparaMaiorObjeto(arquivo.lerArquivo(args));
		
	}
}
