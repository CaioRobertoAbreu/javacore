package br.com.java.java8.alura.lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ImprimiUsandoLambdas {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Caelum", "Editora Casa do Codigo", "Alura Online");

        //Lambda. Dá pra usar Classe Anônima também
        palavras.sort((String s1, String s2) -> s1.compareTo(s2));

        /**
         * OBSERVAÇÕES IMPORTANTES:
         * 1. Só funciona com Interfaces Funcionais (que tem apenas um método)
         * 2. Não preciso informar o tipo (Como no exemplo abaixo);
         * 3. Quando tem apenas um comando não é necessário chaves e ponto-e-vírgula;
         * 4. Quando há apenas um argumento não precisa usar parênteses (como abaixo);
         * 5. O 'return' também não é obrigatŕorio.
         */

        //Lambda. Dá pra usar Classe Anônima também
        palavras.forEach(s -> {
            System.out.println(s);
            System.out.println(s); //Repeti apenas para demostrar casos com mais de um comando
        });
    }
}
