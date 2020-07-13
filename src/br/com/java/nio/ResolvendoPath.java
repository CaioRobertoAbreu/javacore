package br.com.java.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 
 * @author Caio
 *
 * Resolver paths serve para juntar caminhos
 * 
 */

public class ResolvendoPath {

	public static void main(String[] args) {
		/**
		 * Os caminhos não precisam existir para usar
		 * a classe Path. No caso abaixo, ambos os 
		 * caminhos são hipoteticos, servindo apenas 
		 * como aprencizado
		 */
		
		Path path1 = Paths.get("home\\caio");
		Path path2 = Paths.get("cursos\\java\\aula01.txt");
//		Path result = path1.resolve(path2);
		
		System.out.println(path1.resolve(path2));
		
		Path absoluto = Paths.get("\\home\\caio");
		Path relativo = Paths.get("teste\\java");
		System.out.println(absoluto.resolve(relativo));
		
		Path absoluto2 = Paths.get("\\home\\caio");
		Path relativo2 = Paths.get("\\teste\\java");
		System.out.println(absoluto2.resolve(relativo2)); //Dois caminhos absolutos
		
		
		
		
		
	}

}
