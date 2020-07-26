package br.com.java.generics;

abstract class Concurso {
	public abstract void consulta();
}

class Candidato extends Concurso {

	@Override
	public void consulta() {
		System.out.println("Candidato");		
	}
}

class Fiscal extends Concurso {

	@Override
	public void consulta() {
		System.out.println("Fiscal");		
	}
}

public class GenericsArray {

	public static void main(String[] args) {
		Candidato[] candidatos = {new Candidato(), new Candidato()};
		Fiscal[] fiscais = {new Fiscal(), new Fiscal()};
		ConsultaPessoasConcurso(candidatos); //Compila e executa pq a JVM sabe Candidato extende Concurso
		System.out.println();
		ConsultaPessoasConcurso(fiscais);  //Compila e executa pq a JVM sabe Fiscal extende Concurso
		fiscais[0] = new Fiscal();
		}
	
	
	
	
	public static void ConsultaPessoasConcurso(Concurso[] arrayConcurso) {
		for(Concurso c : arrayConcurso) {
			c.consulta();
		}
		arrayConcurso[0] = new Candidato(); 
		//Compila mas da erro durante a Execucao pois estou tentando atribuir um objeto diferente (quando passo fiscais como parametro),
		//A JVM sabe exatamente o tipo dos Arrays. Nas colections isso é diferente 
	}

}
