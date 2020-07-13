package br.com.java.io;

import java.io.File;
import java.io.IOException;

public class ClasseFile_Diretorios {

	public static void main(String[] args) throws IOException {
		File diretorio = new File("textos");
		diretorio.mkdir();
		
		File texto = new File(diretorio, "texto.txt");
		File texto2 = new File(diretorio, "texto2.txt");
		File texto3 = new File(diretorio, "texto3.txt");
		
		texto.createNewFile();
		texto2.createNewFile();
		texto3.createNewFile();
		
		File texto4 = new File(diretorio, "Arquivo_Renomeado.txt");
		
		texto3.renameTo(texto4);
		
		File diretorioRenomeado = new File("Textos_Renomeado");
		
		diretorio.renameTo(diretorioRenomeado);
		
		listarArquivos("Textos_Renomeado");
		
		
		
	}
	
	public static void listarArquivos(String pasta) {
		File listar = new File(pasta);
		String[] arquivos = listar.list();
		for (String str : arquivos) {
			System.out.println(str);
		}
	}

}
