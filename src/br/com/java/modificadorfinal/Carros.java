package br.com.java.modificadorfinal;

public class Carros {
	
	/**
	 * O final tamb�m pode ser utilizado na declaracao da classe, ex.: public final class Carros{ }, 
	 * no entanto, n�o seria poss�vel alguma outra classe estender Carros. Na pr�tica ela quase n�o � utilizada.
	 * 
	 * Os M�TODOS com final n�o poderao ser sobrescritos. � utilizando quando vc tem um m�todo em espec�fico
	 * que n�o quer que seja sobrescrito. Vale ressaltar, o metodo nao podera ser sobrescrito, mas poder ter 
	 * sobrecarga.
	 * 
	 * A sobrescrita de m�todos � quando estamos trabalhando com orienta��o a objetos e temos uma classe (filha) que 
	 * acaba herdando de uma outra classe(m�e). Caso a classe filha precise modificar algum comportamento herdado da 
	 * classe m�e, podemos fazer uma sobrescrita do m�todo diretamente da classe filha. @Override
	 * 
	 * A sobrecarga de m�todos � quando temos v�rios m�todos com o mesmo nome, mas com retornos e par�metros diferentes. 
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
	 *Dessa forma, evitamos ficar poluindo o nosso c�digo com nomes de m�todos desnecess�rios, como double 
	 *somaDouble(double num1, double num2), int somaInt(int num1, int num2) e s� variamos os par�metros que recebemos e o 
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
