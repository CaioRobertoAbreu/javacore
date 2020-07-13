package br.com.java.assets;

public class AssertTeste {

	public static void main(String[] args) {
		double salario = -1700;
		
		salarioLiquido(salario);
	}

	
	private static void salarioLiquido(double salario) {
		salario = salario - (salario*0.15);
		assert(salario>0):"O salario nao pode ser negativo. Salario Liquido: " + salario;
		
//		if(salario > 0) {
//			System.out.println("Salario L�quido: " + salario);
//		} else {
//			System.out.println("Os descontos n�o foram contabilizados corretamente");
//			/**
//			 * NUNCA DEVE CHEGAR NESSA LINHA DE CODIGO
//			 * 
//			 */
//		}
		
	}
}
