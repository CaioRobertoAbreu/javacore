package br.com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QZCaractereNegacao {

	public static void main(String[] args) {
		// \d - Todos os digitos
		// \D - Tudo o que nao for d�gito
		// \s - Espa�os em branco (incluindo \t \n \f \r)
		// \S - Caracteres que n�o sao branco
		// \w - Caractere de palavras - a-Z A-Z D�gitos e _
		// \W - Todos os caracteres que n�o sao de palavras
		// [] - Caracteres especificos
		// QUANTIFICADORES (REPETI��ES)
		// ? - 	Zero uma vez
		// * -  Zero ou mais
		// + -  Uma ou mais
		// {} - min e max de vezes - Ex.: {3,7}
		// () - Agrupamento de metacaracteres
		// | -  Fun��o de OU
		// $ -  Fim de linha
		
		
		String texto = "0x1 0x1234 0Xfabc 354 0xf12g";
		String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
		
		Pattern padrao = Pattern.compile(regex);
		Matcher encontrar = padrao.matcher(texto);
		
		System.out.println("Texto: " + texto);
		System.out.println("Tamanho: " + texto.length());
		System.out.println("Expressao: " + encontrar.pattern());

		while(encontrar.find()) {
			System.out.printf("%d - %s\n", encontrar.start(), encontrar.group());
		}
		
	}
}
