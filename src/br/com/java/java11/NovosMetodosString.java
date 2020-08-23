package br.com.java.java11;

public class NovosMetodosString {
    public static void main(String[] args) {

        String nome = "Caio Roberto de Abreu";
        System.out.println("String vazia: " + nome.isBlank());
        nome = " ";
        System.out.println("String vazia: " + nome.isBlank());
        nome = "";
        System.out.println("String vazia: " + nome.isBlank());
    }
}
