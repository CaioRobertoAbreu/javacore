package br.com.java.tokens_delimitadores;

public class ClasseString {

	public static void main(String[] args) {
		String nomes = "Amanda, Joao, Ana, Paulo, Giovanne";
		
		String[] nome = nomes.split(",\\s");
//		String[] nome = nomes.split(", "); -> Posso usar tamb�m uma string
		
		for (String str : nome) {
			System.out.printf("Nome: %s\n", str);
		}
	}

}
