package br.com.java.classes_anonimas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.java.collections.list.ordenacao.Produto;

public class ClasseAnonima {

	public static void main(String[] args) {
		Produto produto = new Produto(004, "Iphone X", 6000d, 6);
		Produto produto2 = new Produto(002, "Galaxy S9", 5000d, 2);
		Produto produto3 = new Produto(012, "Redmi note 8", 1500d, 9);
		Produto produto4 = new Produto(023, "Moto G8 Plus", 1700d, 23);
		Produto produto5 = new Produto(001, "Galaxy A9", 2500d, 7);
		Produto produto6 = new Produto(030, "LG K10", 1500d, 2);
		Produto produto7 = new Produto(021, "LG G7", 2300d, 5);
		
		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add(produto);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);
		produtos.add(produto5);
		produtos.add(produto6);
		produtos.add(produto7);
		
		produtos.sort(new Comparator<Produto>() { //Classe anonima

			@Override
			public int compare(Produto o1, Produto o2) {
				return o1.getPreco().compareTo(o2.getPreco());
			}
		});
		
		produtos.sort((Produto o1, Produto o2) -> o1.getNome().compareTo(o2.getNome())); //Usando Lambda 
		
		produtos.forEach(p -> System.out.println(p));
	}

}
