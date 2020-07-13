package br.com.java.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ClassePaths {

	public static void main(String[] args) {
		Path p = Paths.get("paths");
		Path p2 = Paths.get("pasta\\pastas\\maispastas");
		Path p3 = Paths.get("pasta\\pastas\\maispastas\\Arquivo2.txt");
		Path p4 = Paths.get("pasta\\pastas\\maispastas\\Arquivo3.txt");
		
		
		
		try {
			if(Files.notExists(p))
				Files.createDirectory(p);
			
			if(Files.notExists(p2))
				Files.createDirectories(p2);
//				Files.createDirectories(p2.getParent()); Caso eu nao queira pegar o ultima parte que seria por exemplo um arquivo
			
			if(Files.notExists(p3))	{
				Files.createFile(p3);
				Path destino = Paths.get("pasta\\pastas\\maispastas\\Arquivo2 - copia.txt");
				Files.copy(p3, destino); //p3 é o path de origem (onde tem o arquivo a ser copiado)
//				Files.copy(p3, destino, StandardCopyOption.REPLACE_EXISTING); Faz com que eu sobrescreva o arquivo
				}
		
			
			if(Files.notExists(p4))
				Files.createFile(p4);
			
			if(Files.exists(p4))
				Files.delete(p4);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
