package br.com.java.datas_numeros_moedas;

import java.util.Calendar;
import java.util.Date;

public class ClasseCalendar {

	public static void main(String[] args) {
		Date data = new Date(1_000_000_000);
		System.out.println("Data usando Date: " + data);
		
		Calendar novaData = Calendar.getInstance();
		System.out.println("Data usando Calendar: " + novaData.getTime());
		
		System.out.println("Alterando para 1970...");
		novaData.setTime(data);
		System.out.println("Data usando o valor de Date: " + novaData.getTime()+ "\n");
		
		System.out.println("Voltando para a Data Atual...");
		novaData = Calendar.getInstance();
		System.out.println(novaData.getTime());
		System.out.println("Primeiro dia da semana: " + novaData.getFirstDayOfWeek());//No Brasil é o Domingo
		System.out.println("Dia do mÊs: " + novaData.get(Calendar.DAY_OF_MONTH));
		System.out.println("Dia da semana: " + novaData.get(Calendar.DAY_OF_WEEK));
		System.out.println("Dia do ano: " + novaData.get(Calendar.DAY_OF_YEAR));
		System.out.println("Mês do ano: " + novaData.get(Calendar.MONTH)); //Começa com ZERO
		System.out.println("Ano Atual: " + novaData.get(Calendar.YEAR) + "\n"); //Começa com ZERO
		
		System.out.println("Adicionando tempo...");
		System.out.println("Antes:" + novaData.getTime());
		novaData.add(Calendar.HOUR, 3);
		novaData.add(Calendar.MONTH, 1);
		System.out.println("Mês e Horário: " + novaData.getTime());
		
		/**
		 * O Add adiciona e ser for o caso ele muda o ano, o mês.
		 * Ex.: Se eu adicionar 9 meses em Julho de 2015 o resultado
		 * seria Abril de 2016. Se eu não quiser que isso ocorra eu 
		 * posso usar o roll no lugar do add, sendo assim, ficaria
		 * Abril de 2015.
		 */
		
		
	}

}
