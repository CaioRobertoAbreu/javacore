package br.com.java.collections.equals;

public class Parte3Equals {
	public static void main(String[] args) {
		
		//Embora haja a possibilidade de comparar por meio dos atribuitos,
		//o método equals deve ser utilizado para comparar objetos diretamente, 
		//sem chamar seu aatributos. Além disso pode haver vários atributos
		//que juntos determinam se um obj é igual a outro e não apenas isso,
		//por isso este método deve ser implementado na classe.
		
		//Há algumas regras (que estarao na classe Celular) a serem observadas 
		//na sobrescrita do método.
	
		Celular celular1 = new Celular("1234", "Caio");
		Celular celular2 = null;
		
		System.out.println("Iguais: " + celular1.equals(celular2));
	
	}

}
