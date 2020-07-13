package br.com.java.tokens_delimitadores;

import java.util.Scanner;

public class TokenComPattern {

	public static void main(String[] args) {
		String informacoes = "123 abc a4b6";
		Scanner leitor = new Scanner(informacoes);
		String regex = "[a-z0-9]+";
		
		while(leitor.hasNext()) {
			System.out.println(leitor.next(regex));
		}
		
		leitor.close();
	}

}
