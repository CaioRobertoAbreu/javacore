package br.com.java.datas_numeros_moedas;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class ClasseNumberFormat {

	public static void main(String[] args) {
	
		float valor = 1234567f;
		Locale japao = new Locale("JP");
		
		NumberFormat[] vetor = new NumberFormat[4];
		
		vetor[0] = NumberFormat.getInstance();
		vetor[1] = NumberFormat.getInstance(japao);
		vetor[2] = NumberFormat.getCurrencyInstance();
		vetor[3] = NumberFormat.getCurrencyInstance(japao);
		
		for (NumberFormat i : vetor) {
			System.out.println(i.format(valor));
		}
		System.out.println("");
		
		Locale usa = new Locale("en", "us");
		NumberFormat formatar = NumberFormat.getCurrencyInstance(usa);
		valor = 1254.99f;
		
		System.out.println(formatar.format(valor));
		
		formatar = NumberFormat.getCurrencyInstance();
		System.out.println(formatar.format(valor));
		
		float porcentagem = .07f;
		
		NumberFormat formatporcent = NumberFormat.getPercentInstance();
		System.out.println("\n" + formatporcent.format(porcentagem));
		
		System.out.println("");
		formatar = NumberFormat.getInstance();
		float valor3 = 1234.5678f;
		System.out.println(formatar.format(valor3)); //Irá exibir apenas 3 numeros apos o ponto
		System.out.println(formatar.getMaximumFractionDigits()); 
		//Chamei este método para saber o porque o 4 digito nao aparece, é pq a quantidade maxima é 3
		
		formatar.setMaximumFractionDigits(4); //Mudando para 4 dígitos
		
		System.out.println(formatar.format(valor3));
		
		String valor4 = "1346.65";
		
		try {
			System.out.println("De string para numero: " + formatar.parse(valor4)); //Exceção CHECKED
			formatar.setParseIntegerOnly(true); //Passa para Integer
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
