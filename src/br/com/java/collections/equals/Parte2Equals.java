package br.com.java.collections.equals;

public class Parte2Equals {
	public static void main(String[] args) {
		Animal animal = new Animal("gato");
		Animal animal2 = new Animal("gato");
		
		System.out.println("São iguais: " + animal.getNome().equals(animal2.getNome()));
		
		Pessoa pessoa1 = new Pessoa("123456789-11");
		Pessoa pessoa2 = new Pessoa("123456789-11");
		
		System.out.println("Pessoa são \"iguais\" se tiverem o CPF com o mesmo numero de CPF");
		System.out.println("Pessoa 1: " + pessoa1.getCpf());
		System.out.println("Pessoa 2: " + pessoa2.getCpf());
		System.out.println("Iguais: " + pessoa1.getCpf().equals(pessoa2.getCpf()));
		
		//Conculsão: Com o método Equals consigo comparar os atributos também
	}
}
