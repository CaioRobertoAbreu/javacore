package br.com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenaListaBasico {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();
		nomes.add("Caio");
		nomes.add("Breno");
		nomes.add("Bruno");
		nomes.add(1, "Leo");
		
		Collections.sort(nomes); //Como String não é uma classe primitiva e é uma classe ele ordenou automaticamente
		
		System.out.println("nomes");
		for (String nome : nomes) {
			System.out.println(nome);
		}
	}
}
