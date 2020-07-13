package br.com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantificadores {

	public static void main(String[] args) {
		// \d - Todos os digitos
		// \D - Tudo o que nao for dígito
		// \s - Espaços em branco (incluindo \t \n \f \r)
		// \S - Caracteres que não sao branco
		// \w - Caractere de palavras - a-Z A-Z Dígitos e _
		// \W - Todos os caracteres que não sao de palavras
		// [] - Caracteres especificos
		// QUANTIFICADORES (REPETIÇÕES)
		// ? - 	Zero uma vez 
		// * -  Zero ou mais
		// + -  Uma ou mais
		// {} - min e max de vezes - Ex.: {3,7}
		// () - Agrupamento de metacaracteres
		// | -  Função de OU
		// $ -  Fim de linha
		// ^ -  Caractere de negação
		
//		obs.: O ponto é um caracter coringa por isso usar \\.
		
		String texto = "proj1 proj2 testes diagrams";
		String regex = "proj[^2-9]\\s+";
		
		Pattern padrao = Pattern.compile(regex);
		Matcher encontrar = padrao.matcher(texto);
		
		System.out.println("Data: " + texto);
		System.out.println("Expressao: " + encontrar.pattern());
		
		while(encontrar.find())
			System.out.println(encontrar.start() + " - " + encontrar.group());
		
	}
}
