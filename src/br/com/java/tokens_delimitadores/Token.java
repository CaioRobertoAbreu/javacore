package br.com.java.tokens_delimitadores;

import java.util.Scanner;

public class Token {

	public static void main(String[] args) {
		String apelido = "joao123 maria22 013 mario";
		Scanner leitor = new Scanner(apelido);
		
		while(leitor.hasNext())
			System.out.println(leitor.next());
		
		leitor.close();
		System.out.println("");
//		------------------------------------------------------------
		String substantivo = "mario 123 true";
		Scanner ler = new Scanner(substantivo);
		
		while(ler.hasNext()) {
			if(ler.hasNextInt()) {
				System.out.println(ler.nextInt());
			} else if(ler.hasNextBoolean()) {
				System.out.println(ler.nextBoolean());
			} else {
				System.out.println(ler.next());
			}
		}
		ler.close();
		
	}

}
