package br.com.java.strings;

/**
 * 
 * @author Caio
 *
 *A diferença entre string comuns e strinbuilder ou buffer
 *é que eles permitem que eu adicione(ou remova) mais conteudo 
 *a ela sem que seja necessario criar uma nova string.
 *
 *OBS.: STRINGBUFFER É A MESMA COISA, SÓ MUDA QUE É SINCRONIZADO
 */

public class UsandoStringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("teste");
		System.out.println(sb);
		sb.append(" adicionando mais coisas na string");
		System.out.println(sb);
		sb.reverse(); //Deixa o texto de tras para frente
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.delete(6, (sb.length()+1)); //Deleta um trecho da string. Funciona igual replace
		System.out.println(sb);
		sb.insert(3, "ss"); //Mesma função do append, no entanto, me permite adicionar em um trecho específico. Obs.: Neste caso começa a contar do 1.
		System.out.println(sb);
	}

}
