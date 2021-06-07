/**
 * 
 */
package arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Jeferson
 *
 */
public class LendoArquivosDeTexto {

	public static void main(String[] args) {

		/*
		 * Lendo e escrevendo em arquivos de texto com FileReader e bloco try-with-resources
		 * 
		 */

		String path = "c:\\teste.txt";

		// abre e fecha as streams automaticamente
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			if (line != null)
				System.out.println(line);

		} catch (IOException e) {
			e.printStackTrace();
		}

		
		//Gravando dados no arquivo de texto, append == true
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			String[] linhas = { "Teste", "1", "2", "3", "4" };
			for(String linha : linhas) {
				bw.write(linha);
				bw.newLine();
			}
			

		} catch (IOException e) {
			e.printStackTrace();

		}
	}
}
