package br.com.java.collections.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaProdutos {
	
	public static void main(String[] args) {
		Produto produto = new Produto(312, "Monitor Samsung 23\"", 699.);
		Produto produto2 = new Produto(521, "Mouse Lenovo", 59.);
		Produto produto3 = new Produto(442, "Impressora HP ", 499.);
		Produto produto4 = new Produto(523, "Notebook Asus X510UR", 2699.);
		
		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add(produto);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);
		
		for (Produto p : produtos) {
			System.out.println(p); //Imprimindo na ordem de inserção
		}
		
		Collections.sort(produtos);//Ordenando conforme implementação na classe Produto usando COMPARABLE
		
		System.out.println("\n");
		for (Produto p : produtos) {
			System.out.println(p);
		}
		
		System.out.println("\n");
		Collections.sort(produtos, new ProdutoOrdenaNomeComparetor());
		for (Produto p : produtos) {
			System.out.println(p);
		}
		
	}
}

class ProdutoOrdenaNomeComparetor implements Comparator<Produto>{

	@Override
	public int compare(Produto o1, Produto o2) {
		return o1.getNome().compareTo(o2.getNome());
	}
	
}


