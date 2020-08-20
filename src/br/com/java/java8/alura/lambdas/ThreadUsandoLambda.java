package br.com.java.java8.alura.lambdas;

public class ThreadUsandoLambda {
    public static void main(String[] args) {

        new Thread(() -> System.out.println("Executando Thread")).start();

        //Method Reference. Só funciona em labdas bem simples
        new Thread(System.out::println).start(); //Não vai imprimir nada

    }
}