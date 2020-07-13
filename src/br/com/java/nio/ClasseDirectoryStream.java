package br.com.java.nio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ClasseDirectoryStream {

	public static void main(String[] args) {
		Path diretorio = Paths.get("textos");
				
		try(DirectoryStream<Path> arquivos = Files.newDirectoryStream(diretorio);) {
			
			for (Path arq : arquivos) {
				System.out.println(arq.getFileName());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
