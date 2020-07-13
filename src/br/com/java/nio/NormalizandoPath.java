package br.com.java.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizandoPath {

	public static void main(String[] args) {
		String caminho = "textos\\.\\.\\texto.txt";
		System.out.printf("Caminho passado: %s\n", caminho); 
		
		Path path1 = Paths.get(caminho);
		System.out.println("Path 1: " + path1.normalize());
		
	}

}
