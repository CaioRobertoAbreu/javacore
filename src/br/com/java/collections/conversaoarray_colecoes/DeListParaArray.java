package br.com.java.collections.conversaoarray_colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeListParaArray {
	public static void main(String[] args) {
		//De List para Array
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(1); 
		numeros.add(2); 
		numeros.add(3); 
		numeros.add(4); 
		
		for (Integer integer : numeros) {
			System.out.println(integer);
		}
		
		Integer[] maisNumeros = new Integer[numeros.size()]; 
		numeros.toArray(maisNumeros);
		
		System.out.println(Arrays.toString(maisNumeros));
	}

}
