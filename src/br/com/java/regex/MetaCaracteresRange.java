package br.com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetaCaracteresRange {

	public static void main(String[] args) {
		// \d - Todos os digitos
		// \D - Tudo o que nao for dígito
		// \s - Espaços em branco (incluindo \t \n \f \r)
		// \S - Caracteres que não sao branco
		// \w - Caractere de palavras - a-Z A-Z Dígitos e _
		// \W - Todos os caracteres que não sao de palavras
		// [] - Caracteres especificos
		
		
		String texto = "@Caio3015_ caio0028CG";
		String regex = "[a-gA-C0-9]";
		
		Pattern padrao = Pattern.compile(regex);
		Matcher encontrar = padrao.matcher(texto);
		
		System.out.println("Texto: " + texto);
		System.out.println("Tamanho: " + (texto.length() - 1));
		System.out.println("Expressao: " + padrao.pattern());
		System.out.println("Indices encontrados: ");
		
		while(encontrar.find())
			System.out.print(encontrar.start() + " ");
//------------------------------------------------------------------------
		System.out.println("\n" + "----------------------------------------");
		
		regex = "0[xX][0-9a-fA-F]";
		texto = "12 0x 0X1234 0xf54 0xfabg";
		
		padrao = Pattern.compile(regex);
		encontrar = padrao.matcher(texto);
		
		System.out.println("Texto: " + texto);
		System.out.println("Tamanho: " + texto.length());
		System.out.println("Expressao: " + padrao.pattern());
		System.out.println("Indices Encontrados:");
		
		while(encontrar.find())
			System.out.println(encontrar.start() + " - " + encontrar.group());
			
		
		
	}
}
