package br.com.java.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class ClasseFile {

	public static void main(String[] args) {
		File arquivo = new File("Arquivo1.txt");
		
		try {
			System.out.printf("Criação do arquivo: %b\n", arquivo.createNewFile());
//			arquivo.delete();
			if(arquivo.exists())
				System.out.printf("Arquivo já existente - %s\n", arquivo.getName());
		
			System.out.printf("Permissao de leitura: %b\n",arquivo.canRead());
			System.out.printf("Path: %s\n",arquivo.getAbsolutePath()); //Ou getPath
			System.out.printf("Diretorio: %s\n",arquivo.isDirectory()); 
			System.out.printf("Arquivo: %s\n",arquivo.isFile()); 
			System.out.printf("Oculto: %s\n",arquivo.isHidden()); 
			
			
			Date data = new Date(arquivo.lastModified());
			
			System.out.printf("Ultima modificacao: %s\n", data); 
			
			
			
		}catch (IOException ex){
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		}
	}

}
