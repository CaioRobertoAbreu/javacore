package br.com.java.collections;

import java.util.List;
import java.util.ArrayList;

public class InterfaceList {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("faca");
		palavras.add("garfo");
		palavras.add("colher");
		
		List<String> palavras2 = new ArrayList<String>();
		palavras2.addAll(palavras);
		palavras2.add("Concha");
		
		List<String> palavras3 = new ArrayList<String>();
		palavras3.add("Casa");
		palavras3.add("Apartamento");
		palavras3.add("Mansão");
		
		palavras3.clear();
		
		System.out.println("Lista 1");
		palavras.forEach(e -> System.out.println(e));
		System.out.println("\nLista 2");
		palavras2.forEach(e2 -> System.out.println(e2));
		System.out.println("\nLista 3");
		palavras3.forEach(e3 -> System.out.println(e3));
		
		
		
	}

}
