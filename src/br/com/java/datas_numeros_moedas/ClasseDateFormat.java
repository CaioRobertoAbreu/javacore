package br.com.java.datas_numeros_moedas;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class ClasseDateFormat {

	public static void main(String[] args) {
		//Variavel para armazenamento de dados em forma de LONG
		Date dataLong = new Date(1523905894300L);
		
		//Criação de uma variavel para armazenar a data
		Calendar data = Calendar.getInstance(); 
		
		//Alterando a Data para deixar a execução mais legal
		data.setTime(dataLong);
		
		
		//Criação do "objeto" que irá fazer a formatação da data e sua respectiva formatação
		DateFormat formataData = DateFormat.getDateInstance(DateFormat.MEDIUM); 
		
		//Usando o método para usar a formatação e passando como parametro a data
		System.out.println(formataData.format(data.getTime()) + "\n");

//-----------------------------------------------------------------------------------------------------
		
		data.setTime(data.getTime());
		
		DateFormat[] dataFormatada = new DateFormat[6];
		
		dataFormatada[0] = DateFormat.getInstance();
		dataFormatada[1] = DateFormat.getDateInstance();
		dataFormatada[2] = DateFormat.getDateInstance(DateFormat.SHORT);
		dataFormatada[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		dataFormatada[4] = DateFormat.getDateInstance(DateFormat.LONG);
		dataFormatada[5] = DateFormat.getDateInstance(DateFormat.FULL);
		
		for(int i=0; i<dataFormatada.length; i++) {
			System.out.println("Posicao " + i + ": " + dataFormatada[i].format(data.getTime()));
		}

		
		
	}

}
