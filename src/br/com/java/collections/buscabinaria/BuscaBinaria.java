package br.com.java.collections.buscabinaria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.java.collections.ordenacao.Produto;

public class BuscaBinaria {
	
	/**
	 * A busca binária vai me devolver qual a posição que se encontra um
	 * valor ou qual posição ele deveria estar caso ele não exista na 
	 * coleção.
	 * Para que a busca seja CONFIÁVEL é necessário realizar a ordenação
	 * da lista.
	 * 
	 * Caso o objeto nao exista, o retorno com o índice obedece a seguinte formula:
	 * - (indice do valor procurado) - 1, ou seja,
	 * indice 0 retorna - 0 - 1 = -1
	 * indice 1 retorna - 1 - 1 = -2
	 * indice 2 retorna - 2 - 1 = -3
	 * 
	 * Para saber o índice real basta somar +1 ao valor final e multiplicar
	 * por -1.
	 * para o indice 0 -> -1 + 1 = 0
	 * para o indice 1 -> -2 + 1 = -1 * -1 = 1
	 * para o indice 2 -> -3 + 1 = -2 * -1 = 2
	 */
	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add(new Produto(4131, "Mouse", 56.9));
		produtos.add(new Produto(4223, "Teclado", 96.9));
		produtos.add(new Produto(4541, "Monitor", 570.9));
		produtos.add(new Produto(4421, "WebCam", 66.9));
		produtos.add(new Produto(4652, "Cadeira Gamer", 1600.9));
		
		Collections.sort(produtos); //Usando a Ordenação COMPARABLE (por id)

		for (Produto produto : produtos) {
			System.out.println(produto);
		}
		
		System.out.println("\n");
		
		Produto produto = new Produto(6654, "Mouse", 56.9); //Qual posicao devera estar
		Produto produto2 = new Produto(4131, "Mouse", 56.9); //Qual posicao este produto esta
		System.out.println(Collections.binarySearch(produtos, produto));
		System.out.println(Collections.binarySearch(produtos, produto2));
		
//		QUANDO USAR COMPARATOR ELE DEVE SER PASSADO COMO PARAMETRO NO METODO
		
		Collections.sort(produtos, new ProdutoOrdenaNomeComparetor());
		
		System.out.println("\n");
		for (Produto p : produtos) {
			System.out.println(p);
		}
		
		Produto produto3 = new Produto(5421, "Memoria Ram", 400.); //Qual posicao deveria estar
		System.out.println("\n");
		System.out.println(Collections.binarySearch(produtos, produto3, new ProdutoOrdenaNomeComparetor()));
		System.out.println(Collections.binarySearch(produtos, produto2, new ProdutoOrdenaNomeComparetor()));
		
	}
}

class ProdutoOrdenaNomeComparetor implements Comparator<Produto>{

	@Override
	public int compare(Produto o1, Produto o2) {
		return o1.getNome().compareTo(o2.getNome());
	}
	
}
