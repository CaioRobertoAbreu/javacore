package br.com.java.collections.conversaoarray_colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeArrayParaList {
	public static void main(String[] args) {
		//De Array para List
		Integer[] numeros = new Integer[5];
		numeros[0] = 0;
		numeros[1] = 1;
		numeros[2] = 2;
		numeros[3] = 3;
		numeros[4] = 4;
		
		List<Integer> lista1 = new ArrayList<Integer>();
		lista1 = Arrays.asList(numeros); //Perceba que estou passando a referencia, se modificar um, modifica o outro
		
		numeros[1] = 10;
		lista1.set(4, 40);
		
		System.out.println(Arrays.toString(numeros));
		lista1.forEach(numero -> System.out.println(numero)); //Lambda
		
		List<Integer> novaListaNumeros = new ArrayList<Integer>();
		novaListaNumeros.addAll(Arrays.asList(numeros)); //Criando uma nova lista, a referencia nao esta sendo passada
		
		novaListaNumeros.set(1, 1);
		
		System.out.println(Arrays.toString(numeros));
		novaListaNumeros.forEach(numeros2 -> System.out.println(numeros2));
	}

}
