package br.com.java.collections.remover;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.java.collections.ordenacao.Produto;

public class Remover {
	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add(new Produto(123, "Iphone", 6000., 4));
		produtos.add(new Produto(341, "Notebook", 3000., 6));
		produtos.add(new Produto(313, "PC Gamer", 5500., 0));
		produtos.add(new Produto(213, "X Box One", 2000., 0));
		
		System.out.println("Quantidade: " + produtos.size());
		
		Iterator<Produto> iterador = produtos.iterator();
		
		while(iterador.hasNext()) {
			if(iterador.next().getQuantidade() == 0) {
				iterador.remove();
			}
		}
		
		System.out.println("\nQuantidade: " + produtos.size());
		produtos.forEach(produto -> System.out.println(produto));
		
	}
}
