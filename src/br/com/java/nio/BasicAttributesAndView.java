package br.com.java.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Calendar;

public class BasicAttributesAndView {

	public static void main(String[] args) {
		
		Path arquivo = Paths.get("D:\\Documentos\\cormem.pdf");
		try {
			BasicFileAttributes atributos = Files.readAttributes(arquivo, BasicFileAttributes.class);
			System.out.println("Criação: " + atributos.creationTime());
			System.out.println("Ultima modificacao: " + atributos.lastModifiedTime());
			System.out.println("Ultimo acesso: " + atributos.lastAccessTime());			
			System.out.println("Tamano (em bytes): " + atributos.size());
			System.out.println("------------------------------------------------");
			
			FileTime ultimaModficacao = atributos.lastModifiedTime();
			FileTime criacao = atributos.creationTime();
			
			Calendar c = Calendar.getInstance();
			
			FileTime acesso = FileTime.fromMillis(c.getTimeInMillis());
			
			
			BasicFileAttributeView modificandoAtributos = Files.getFileAttributeView(arquivo, BasicFileAttributeView.class);
			modificandoAtributos.setTimes(ultimaModficacao, acesso, criacao);
			
			atributos = Files.readAttributes(arquivo, BasicFileAttributes.class);
			System.out.println("Criação: " + atributos.creationTime());
			System.out.println("Ultima modificacao: " + atributos.lastModifiedTime());
			System.out.println("Ultimo acesso: " + atributos.lastAccessTime());		
		
		
		
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
				
	}
}
