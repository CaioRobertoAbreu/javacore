package br.com.java.threads;

public class Principal {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Iniciando a Thread");

        Thread.sleep(5000);

        System.out.println("Encerrando a Thread.");
    }
}
