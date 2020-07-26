package br.com.java.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsList {

	/**
	 * Os generics no Java só funcionam em tempo de compilação,
	 * depois que gera o Bytecode a JVM não sabe qual tipo de 
	 * dado está sendo executado, sendo assim, as coleções têm
	 * um comportamento diferente dos Arrays. 
	 */
	public static void main(String[] args) {
		List<Concurso> concursos = new ArrayList<Concurso>();
		concursos.add(new Candidato()); //Dados podem ser adicionados normalmente
		concursos.add(new Fiscal());
		List<Candidato> candidatos = new ArrayList<Candidato>();
		candidatos.add(new Candidato());
		List<Fiscal> fiscais = new ArrayList<Fiscal>();
		fiscais.add(new Fiscal());
		
		//consultaListas(candidatos); //Não compila pq em execução a JVM não saberá o tipo de dado
		consultaListas(concursos);
		System.out.println();
		consultaComGenerics(candidatos);
		System.out.println();
		consultaComGenerics(fiscais);
		
	}
	
	static void consultaListas(List<Concurso> lista) {
		for(Concurso c : lista) {
			c.consulta();
		}
	}
	
	static void consultaComGenerics(List<? extends Concurso> lista) { //Aqui eu garanto que serão passados apenas dados extendem concurso
		for(Concurso c : lista) {
			c.consulta();
		}
		//lista.add(new Candidato()); //não compila para garantir que eu não insira dados que não extendem Concurso
	}
	
	static void consultaComGenericsAdd(List<? super Candidato> candidato) {//Me permite adicionar candidatos e instanciar objetos que seja "super"
		candidato.add(new Candidato()); //Pode
	  //Candidato.add(new Object()); //Não compila
		Object c = new Candidato();
		Concurso con = new Candidato();
	}

}
