package br.com.java.wrapper;

public class Wrapper {

	public static void main(String[] args) {
		
		int valor1 = 250;
		Integer valor2 = valor1; //AutoBoxing
		
		Integer valor3 = 23;
		int valor4 = valor3; //UnBoxing
		
		System.out.printf("%d - %d\n%d - %d\n\n", valor1, valor2, valor3, valor4);
		
		
		Integer numero = 10;
		int teste = 10;
		Integer numero2 = new Integer("10"); //S� aceita string dessa forma
		
		System.out.printf("%s %d\n%s %d\n%s %d\n\n", "Integer",numero,"Int", teste, "Integer", numero2);
		
		Double novoNumero = 10.5;
		
		double deWrapper = novoNumero;
		
		String novaString = "33";
		
		System.out.printf("%3.1f\n%3.1f\n%s\n", novoNumero, deWrapper, novaString);
		
		Float primeiroFloat = Float.parseFloat(novaString);
		
		System.out.printf("Passando numero para Float: %3.1f\n", primeiroFloat );
		
		Double primeiroDouble = 20.93D;
		double segundoDouble = primeiroDouble.doubleValue(); //Passando para double primitivo
		
		double numeroQualquer = 45;
		Double terceiroDouble = 0D;
		terceiroDouble.valueOf(numeroQualquer); //Pegando um objeto e transformando em primitivo
		
		Character caracter = 'a';
		System.out.println(caracter.isDigit(caracter));
		System.out.println(caracter.isLetter(caracter));
		System.out.println(caracter.isLetterOrDigit(caracter));
		
	}

}
