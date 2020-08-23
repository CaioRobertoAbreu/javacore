package br.com.java.java11;

public class Var {
    public static void main(String[] args) {
        var nome = "Caio Roberto de Abreu";
        var idade = 23;
        var profissao = "Programador Java Júnior";

        System.out.println(nome + ", " + idade + ". " + profissao + ". ");

        var texto = "la la lend";
//      texto = 123; dá erro de compilação
        System.out.println(texto);
    }
}
