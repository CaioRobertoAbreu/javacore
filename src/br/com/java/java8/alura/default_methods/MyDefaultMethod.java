package br.com.java.java8.alura.default_methods;

public interface MyDefaultMethod {

    default void imprimir(String palavra){
        System.out.println(palavra);
    }
}
