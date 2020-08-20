package br.com.java.java8.alura.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MethodReference {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Casa Do Codigo", "Alura Online", "Caelum");
//      words.sort((String s1, String s2) -> s1.compareTo(s2));

        //Method Reference
        words.sort(String::compareTo);

        //Method Reference
        words.forEach(System.out::println);

        Usuario pedro = new Usuario("Pedro");

        //Lambda
        Function<Usuario, String> funcao = u -> u.getNome();
        //Method Reference
        Function<Usuario, String> funcao2 = Usuario::getNome;

        System.out.println(funcao.apply(pedro));
        System.out.println(funcao2.apply(pedro));


    }
}
