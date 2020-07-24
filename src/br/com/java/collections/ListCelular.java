package br.com.java.collections;

import java.util.ArrayList;
import java.util.List;

import br.com.java.collections.equals.Celular;

public class ListCelular {
	public static void main(String[] args) {
		Celular celular = new Celular("343252", "Iphone X");
		Celular celular2 = new Celular("12345", "Redmi Note 7");
		Celular celular3 = new Celular("432426", "Moto G8 Plus");
		
		List<Celular> celularList = new ArrayList<Celular>();
		celularList.add(celular);
		celularList.add(celular2);
		celularList.add(celular3);
		
		Celular celular4 = new Celular("12345", "Redmi Note 7");
		if(celularList.contains(celular4)) {
			System.out.println("Aparelho já esta na lista");
		} else {
			celularList.add(celular4);
		}
		
		for (Celular celulares : celularList) {
			System.out.println(celulares);
		}
		
	}
}
