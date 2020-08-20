package br.com.java.java8.alura.default_methods;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Alura Online", "Editora Casa do Codigo", "Caelum");

//      Usando Comparable que é implementado na Class String
        Collections.sort(palavras);
        System.out.println(palavras);

//      Usando Comparator para comparar por tamanho
        palavras.sort(new Comparador());
        System.out.println(palavras);

//      Método que substitui o foreach padrão
//      for (String p : palavras){
//          System.out.println(p);
//      }
        System.out.println();
        System.out.println("Usando Consumer");
        palavras.forEach(new ImprimirPalavra()); //O MÉTODO DEFAULT ESTÁ NA IMPLEMENTAÇÃO DO FOREACH (JAVADOC)
    }
}

//Implementação da Interdace Consumer
class ImprimirPalavra implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

//O tanto de código que precisa escrever para usar um Comparator
class Comparador implements Comparator<String> {


    @Override
    public int compare(String s1, String s2) {
        if(s1.length() < s2.length())
            return -1;

        if(s1.length() > s2.length())
            return 1;

        return 0;
    }
}

