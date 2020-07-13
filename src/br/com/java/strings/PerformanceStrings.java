package br.com.java.strings;
/**
 * 
 * @author Caio
 * Neste exercicio testamos bastante a capacidade do pc e do pool de memoria
 * com strings, stringbuilder, stringbuffer
 */
public class PerformanceStrings {

	public static void main(String[] args) {
		long inicio = System.currentTimeMillis();
		concatStrings(10000);
		long fim = System.currentTimeMillis();
		System.out.printf("Tempo Gasto (string normal): %d ms \n", (fim - inicio) );
		
		inicio = System.currentTimeMillis();
		concatStringsBuilder(10000000);
		fim = System.currentTimeMillis();
		System.out.printf("Tempo Gasto (StringBuilder): %d ms\n", (fim - inicio) );
		
		inicio = System.currentTimeMillis();
		concatStringsBuffer(10000000);
		fim = System.currentTimeMillis();
		System.out.printf("Tempo Gasto (StringBuffer): %d ms\n", (fim - inicio) );
	}
	
	private static void concatStrings (int tamanho) {
		String string = "";
		for(int i=0; i<tamanho; i++) {
			string += i;
		}
	}
	
	private static void concatStringsBuilder (int tamanho) {
		StringBuilder sb = new StringBuilder(tamanho);
		for(int i=0; i<tamanho; i++) {
			sb.append(i);
		}
	}
	
	private static void concatStringsBuffer (int tamanho) {
		StringBuffer sb = new StringBuffer(tamanho);
		for(int i=0; i<tamanho; i++) {
			sb.append(i);
		}
	}
	
}
