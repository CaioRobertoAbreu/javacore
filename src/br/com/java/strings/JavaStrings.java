package br.com.java.strings;

public class JavaStrings {

	public static void main(String[] args) {
		String nome = "Caio";
		String sobrenome = " Abreu";
		System.out.printf("NOME: %s%s\n\n", nome.toUpperCase(), sobrenome.toUpperCase());
		
		nome = nome.concat(sobrenome) ;
		System.out.printf("NOME: %s\n\n", nome.toUpperCase());
		
		String objeto1 = "Mesa";
		String objeto2 = "mesa";
		String objeto3 = "cadeira";
		String objeto4 = "     remove espaços no começo e no fim  ";
		
		System.out.println(objeto1.equals(objeto2)); //Verifica se o valor do objeto é igual
		System.out.println(objeto1.equalsIgnoreCase(objeto2)); //Verifica se o valor do objeto é igual ignorando CamelCase
		System.out.println(objeto3.length());
		System.out.println(objeto3.replace('a', 'o'));
		System.out.println(objeto3.substring(2));
		System.out.println(objeto3.substring(0, 5));
		System.out.println(objeto4);
		System.out.println(objeto4.trim());
	}

}
