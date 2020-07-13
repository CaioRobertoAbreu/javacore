package br.com.java.nio;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ClassePathsIntroducao {

	public static void main(String[] args) {
		Path p = Paths.get("D:\\Java\\Alura\\DevDojo\\Arquivo1.txt");
		Path p2 = Paths.get("D:","Java","Alura","DevDojo","Arquivo1.txt");
		
		System.out.printf("%s\n%s\n",p.toAbsolutePath(), p2.toAbsolutePath());
		
		File arquivo = new File("arquivo2.txt");
		
		File teste = p.toFile(); //Passa para arquivo
		Path arquivo2 = arquivo.toPath(); //Passa para path
		
	}

}
