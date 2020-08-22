package br.com.java.java8.dateapi;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class LocalDateAlura {
    /**
     * OBSERVAÇÃO IMPORTANTE:
     * As datas são imutáveis, logo o retorno é sempre uma nova data,
     * sendo assim, é necessário criar uma variável com o retorno.
     */

    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        LocalDate natal = LocalDate.of(2020, Month.DECEMBER, 25);

        System.out.println("Data de hoje: " + hoje);
        System.out.println("Natal: " + natal);
        System.out.println("Meses até o Natal: " + (natal.getMonthValue() - hoje.getMonthValue()));

        System.out.println("Dias para o natal: " + Period.between(hoje, natal).getDays() +
                " dias e " + Period.between(hoje, natal).getMonths() + " mes(es)." );

        System.out.println("Nova data para o Natal: " + natal.plusYears(4).format(DateTimeFormatter
            .ofPattern("dd/MM/yy")));
    }

}
