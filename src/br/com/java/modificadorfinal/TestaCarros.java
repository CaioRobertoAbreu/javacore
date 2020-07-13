package br.com.java.modificadorfinal;

public class TestaCarros {
	
	public static void main(String[] args) {
		Carros carro = new Carros();
		carro.setMarca("Renault");
		carro.setNome("Clio");
		
		System.out.println(Carros.VELOCIDADEFINAL); //Constante
		System.out.println(carro);
		carro.getComprador().setNome("Jefferson");
		System.out.println(carro);
	}

}
