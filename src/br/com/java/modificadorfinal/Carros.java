package br.com.java.modificadorfinal;

public class Carros {
	
	/**
	 * O final também pode ser utilizado na declaracao da classe, ex.: public final class Carros{ }, 
	 * no entanto, não seria possível alguma outra classe estender Carros. Na prática ela quase não é utilizada.
	 * 
	 * Os MÉTODOS com final não poderao ser sobrescritos. É utilizando quando vc tem um método em específico
	 * que não quer que seja sobrescrito. Vale ressaltar, o metodo nao podera ser sobrescrito, mas poder ter 
	 * sobrecarga.
	 * 
	 * A sobrescrita de métodos é quando estamos trabalhando com orientação a objetos e temos uma classe (filha) que 
	 * acaba herdando de uma outra classe(mãe). Caso a classe filha precise modificar algum comportamento herdado da 
	 * classe mãe, podemos fazer uma sobrescrita do método diretamente da classe filha. @Override
	 * 
	 * A sobrecarga de métodos é quando temos vários métodos com o mesmo nome, mas com retornos e parâmetros diferentes. 
	 * Exemplo:
     *		
     *		public class Calculadora {
	 *
	 * 			public int soma(int num1, int num2) {
     *   			return num1 + num2;
     *			}
	 *
     *			public double soma(double num1, double num2) {
     *   			return num1 + num2;
     *			}
	 *		}
	 *Dessa forma, evitamos ficar poluindo o nosso código com nomes de métodos desnecessários, como double 
	 *somaDouble(double num1, double num2), int somaInt(int num1, int num2) e só variamos os parâmetros que recebemos e o 
	 *retorno, mas continuamos a utilizar o mesmo nome.
	 * 
	 * 
	 */
	
	
	private final Comprador comprador = new Comprador();
	public static final double VELOCIDADEFINAL = 250;
	private String modelo;
	private String marca;
	
	
	@Override
	public String toString() {
		return "Carros [comprador: " + comprador + ", nome: " + modelo + ", marca: " + marca + "]";
	}
	public String getNome() {
		return modelo;
	}
	public void setNome(String nome) {
		this.modelo = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public Comprador getComprador() {
		return comprador;
	}
	
}
