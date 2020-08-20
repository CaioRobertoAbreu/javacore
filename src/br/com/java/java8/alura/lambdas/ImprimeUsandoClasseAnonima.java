package br.com.java.java8.alura.lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ImprimeUsandoClasseAnonima {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Editora Casa do Codigo", "Alura Online", "Caelum");

//      Classe Anônima
        palavras.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {

                return s1.compareTo(s2);
            }
        });

//      Classe Anônima
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        palavras.forEach(consumer); //Poderia ter passado direto
    }
}
