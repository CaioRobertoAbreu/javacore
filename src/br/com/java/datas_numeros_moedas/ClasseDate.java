package br.com.java.datas_numeros_moedas;

import java.util.Date;
/**
 * 
 * @author Caio
 * A classe Date está depreciada, e seus métodos(a maiorida deles) nao
 * nao sao mais utilizados. Sendo assim, usar a classe ABSTRATA Calendar
 */

public class ClasseDate {

	public static void main(String[] args) {
		Date data = new Date();
		System.out.println(data);
		System.out.println(data.getTime());
	}

}
