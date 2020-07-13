package br.com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegulares {

	public static void main(String[] args) {
		String texto = "testando as palavras em java"; //Definicao do texto para encontrar a expressao
		String regex = "a"; //Definicao da expressao que deverá ser encontrada, se houver
		
		Pattern padrao = Pattern.compile(regex); //Instanciando classe responsavel por compilar a expressao
		Matcher encontrar = padrao.matcher(texto); //Instanciando a classe que que será responsável por encontrar as expressoes no texto
		
		System.out.println("Texto: " + texto);
		System.out.println("Expressao: " + padrao.pattern());
		System.out.println("Indices Ecnontrados: ");
		
		while(encontrar.find())
			System.out.print(encontrar.start() + " ");
	}

}
