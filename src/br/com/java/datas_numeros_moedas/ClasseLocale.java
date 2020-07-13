package br.com.java.datas_numeros_moedas;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class ClasseLocale {

	public static void main(String[] args) {
		Calendar data = Calendar.getInstance();
		Locale polonia = new Locale("pl", "PL");
		Locale japao = new Locale("ja");
		data.set(2020, Calendar.APRIL, 13);		
		DateFormat formatado = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.printf("BRASIL: %s\n", formatado.format(data.getTime()));
		
		formatado = DateFormat.getDateInstance(DateFormat.FULL, polonia);
		System.out.printf("POLONIA: %s\n", formatado.format(data.getTime()));
		
		formatado = DateFormat.getDateInstance(DateFormat.FULL, japao);
		System.out.printf("JAPAO: %s\n", formatado.format(data.getTime()) );
		
		
		
		System.out.println("\nPais: " + polonia.getDisplayCountry());
		System.out.println("Pais: " + polonia.getDisplayCountry(polonia));

	}

}
