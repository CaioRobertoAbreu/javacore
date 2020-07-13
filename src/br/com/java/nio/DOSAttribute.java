package br.com.java.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

/**
 * 
 * @author Caio
 *
 * O que muda do BasicAttributes é a adição de 4 classes,
 * veremos apenas duas.
 */

public class DOSAttribute {

	public static void main(String[] args) {
		Path arquivo = Paths.get("textos\\texto.txt");
		try {
			Files.setAttribute(arquivo, "dos:hidden", true); //Usando a classe Files
			Files.setAttribute(arquivo, "dos:readonly", true);
			
			
			DosFileAttributes atributos = Files.readAttributes(arquivo, DosFileAttributes.class);
			System.out.println("Arquivo Oculto: " + atributos.isHidden());
			System.out.println("Apenas leitura: " + atributos.isReadOnly());
			
			DosFileAttributeView modificando = Files.getFileAttributeView(arquivo, DosFileAttributeView.class);
			modificando.setHidden(false);
			modificando.setReadOnly(false);
			
			System.out.println("-------------------------------------------------");
			atributos = Files.readAttributes(arquivo, DosFileAttributes.class);
			System.out.println("Arquivo Oculto: " + atributos.isHidden());
			System.out.println("Somente leitura: " + atributos.isReadOnly());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
