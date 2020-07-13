package br.com.java.collections.equals;

public class Parte1Equals {
	
	public static void main(String[] args) {
		//O método Equals compara REFERENCIAS
		Integer num1 = 10;
		Integer num2 = 100;
		
		System.out.println("Iguais: " + num1.equals(num2));
		
		num2 = 10;
		System.out.println("Iguais: " + num1.equals(num2));
		
		String palavra1 = "Caio";
		String palavra2 = "Caio";
		System.out.println("Iguais: " + palavra1.equals(palavra2));
		
		Animal animal1 = new Animal("gato");
		Animal animal2 = new Animal("gato");
		System.out.println("Iguais: " + animal1.equals(animal2));
		
		//Testando com ==
		System.out.println("\nUsando ==");
		System.out.println("Iguais: " + (num1 == num2));
		System.out.println("Iguais: " + (palavra1 == palavra2));
		System.out.println("Iguais: " + (animal1 == animal2));
		
		//Conclusão A saída para o == é a mesma com Equals
	}
	
}
