package br.com.java.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ClasseFileWriter_Reader {

	public static void main(String[] args) {
		File arquivo = new File("FileReader_Writer1");
		try(FileWriter fw = new FileWriter(arquivo);
			FileReader fr = new FileReader(arquivo);){

			fw.write("Escrevendo no arquivo\n");
			fw.write("Mais uma linha\n");
			fw.write("mais texto\n");
			fw.flush();
			
			//OBS.: Se eu executar novamente o arquivo será sobrescrito
			//Caso eu queria adicionar ai eu uso o append na instanciacao 
			//da classe que por padrao é false. ... = new File("arquivo", true);
			
			char[] leitura = new char[100];
			int numeroCaracteres = fr.read(leitura);
			fw.write("Caracteres Lidos: " + numeroCaracteres);
			
			System.out.println("Lendo o arquivo: ");
			for(char leitor: leitura) {
				System.out.print(leitor);
			}
			
			System.out.println("\nEscrevendo diretamente para o console: ");
			System.out.println("Nº de caracteres lidos: " + numeroCaracteres);
			System.out.println("Lendo mais uma vez: " + fr.read(leitura)); //Retorna -1 pois o metodo le uma vez só, sendo assim, o "cursor" está no final do arquivo.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}

}
