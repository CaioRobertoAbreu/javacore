package br.com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetaCaracteres {

	public static void main(String[] args) {
		// \d - Todos os digitos
		// \D - Tudo o que nao for d�gito
		// \s - Espa�os em branco (incluindo \t \n \f \r)
		// \S - Caracteres que n�o sao branco
		// \w - Caractere de palavras - a-Z A-Z D�gitos e _
		// \W - Todos os caracteres que n�o sao de palavras
		
		
		String texto = "@caio3015_ caio0028";
		String regex = "\\W";
		
		Pattern padrao = Pattern.compile(regex);
		Matcher encontrar = padrao.matcher(texto);
		
		System.out.println("Texto: " + texto);
		System.out.println("Tamanho: " + (texto.length() - 1));
		System.out.println("Expressao: " + padrao.pattern());
		System.out.println("Indices encontrados: ");
		
		while(encontrar.find())
			System.out.print(encontrar.start() + " ");
	}

}
