package br.com.java.generics.classes;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest {
	public static void main(String[] args) {
		
		ObjetoAlugavel<Carro> alugarCarro = new ObjetoAlugavel<Carro>();
		alugarCarro.getObjetosAlugaveis().add(new Carro("BMW"));
		alugarCarro.getObjetosAlugaveis().add(new Carro("Audi"));
		
		System.out.println(alugarCarro.consultarDisponiveis());
		Carro c = alugarCarro.alugarObjeto();
		System.out.println(alugarCarro.consultarDisponiveis());
		alugarCarro.devolverObjeto(c);
		System.out.println(alugarCarro.consultarDisponiveis());
		
		ObjetoAlugavel<Celular> alugarCelular = new ObjetoAlugavel<Celular>();
		alugarCelular.getObjetosAlugaveis().add(new Celular("Iphone X"));
		alugarCelular.getObjetosAlugaveis().add(new Celular("Redmi Note 8"));
		
		System.out.println(alugarCelular.consultarDisponiveis());
		Celular celular = alugarCelular.alugarObjeto();
		System.out.println(alugarCelular.consultarDisponiveis());
		alugarCelular.devolverObjeto(celular);
		System.out.println(alugarCelular.consultarDisponiveis());
		
	}
}

class ObjetoAlugavel<T> { //Classe Generica
	private List<T> objetosAlugaveis = new ArrayList<T>();
	
	public List<T> getObjetosAlugaveis() {
		return objetosAlugaveis;
	}
	
	public T alugarObjeto() {
		System.out.println("\nAlugando... ");
		T objeto = objetosAlugaveis.remove(0);
		return objeto;
	}
	
	public void devolverObjeto(T objeto) {
		System.out.println("\nDevolvendo...");
		objetosAlugaveis.add(objeto);
	}
	
	public List<T> consultarDisponiveis() {
		System.out.println("\nConsultando disponíveis");
		return objetosAlugaveis;
	}
}

