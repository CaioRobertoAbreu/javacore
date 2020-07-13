package br.com.java.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.DateFormat;
import java.util.Date;

/**
 * 
 * @author Caio
 *
 * Será utilizado alguns atributos básicos para conhecimento.
 * O Java criou 3 interfaces que tornam a utilização de atribuitos mais eficaz. Sao elas:
 * BasicFileAttributes, PosixFileAttributes and DOSFileAttributes - Apenas para leitura
 * 
 * Para modificar temos as seguintes classes
 * BasicFileAttributeView, PosixFileAttributeView, DOSFileAttributeView,
 * FileOwnerAttributeView, AclFileAttributeView
 */

public class Attributes {

	public static void main(String[] args) {
		File arquivo = new File("Arquivo1.txt");
		System.out.printf("Ultima modificacao: %s\n", arquivo.lastModified());
		
		Date ultimaModificacao = new Date(arquivo.lastModified());
		DateFormat formata = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.printf("Ultima Modificacao: %s\n", formata.format(ultimaModificacao.getTime()));
		
		Path path = Paths.get("Arquivo1.txt");
		
		try {
			System.out.println("\nUtilizando a classe Path\n");
			System.out.printf("Ultima modificacao: %s\n", Files.getLastModifiedTime(path));
			System.out.printf("Executavel: %b\n", Files.isExecutable(path));
			System.out.printf("Permissao de leitura: %b\n", Files.isReadable(path));
			System.out.printf("Permissao de gravacao: %b\n", Files.isWritable(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			BasicFileAttributes atributesBasicos = Files.readAttributes(path, BasicFileAttributes.class);
			System.out.println("\nUsando BasicFileAttributes");
			System.out.println(atributesBasicos.creationTime());
			System.out.println(atributesBasicos.lastModifiedTime());
			System.out.println(atributesBasicos.lastAccessTime());
			System.out.println(atributesBasicos.isRegularFile());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
