package br.com.java.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizandoPath {

	public static void main(String[] args) {
		Path p1 = Paths.get("\\users\\caio");
		Path p2 = Paths.get("\\users\\caio\\desktop");
		Path p3 = Paths.get("\\desktop\\teste");
		
		Path p4 = Paths.get("arquivos\\documentos");
		Path p5 = Paths.get("arquivos\\documentos\\curriculo.java");
		
		System.out.println("Relativizando: " + p1.relativize(p2));
		System.out.println("Relativizando: " + p2.relativize(p1));
		System.out.println("Relativizando: " + p3.relativize(p1));		
		System.out.println("Relativizando: " + p1.relativize(p3));		
		System.out.println("Relativizando: " + p4.relativize(p5));		
		System.out.println("Relativizando: " + p5.relativize(p4));		
//		System.out.println("Relativizando: " + p2.relativize(p4)); O java não consegue encontrar um caminho quando usamos caminho relativo
		System.out.println("");
		
//		-------------------------------------------------------------------------
		
		Path absoluto1 = Paths.get("/home/william");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/william/java/Pessoa.java");
        
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/Funcionario.java");
    
        System.out.println("1: "+absoluto1.relativize(absoluto3));
        System.out.println("2: "+absoluto3.relativize(absoluto1));
        System.out.println("3: "+absoluto1.relativize(absoluto2));
        System.out.println("4: "+relativo1.relativize(relativo2));
        System.out.println("5: "+relativo2.relativize(relativo1));
//        System.out.println("6: "+absoluto1.relativize(relativo1)); Esse aqui dá erro
	}

}
