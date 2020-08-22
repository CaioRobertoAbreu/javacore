package br.com.java.java8.dateapi;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DatasDevDojo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2017, 2, 15);
        LocalDate date2 = LocalDate.of(2017, Month.DECEMBER, 25);

        System.out.println("Data completa: ".toUpperCase() + date);
        System.out.println("Dia ".toUpperCase() + date.getDayOfMonth());
        System.out.println("Mes ".toUpperCase() + date.getMonthValue() + " - " +
                date.getMonth());
        System.out.println("Ano ".toUpperCase() + date.getYear());
        System.out.println("Quanto dias? " + date.lengthOfMonth());
        System.out.println("Ano bissexto: " + date.isLeapYear()); //Verifica se é ano Bissexto

        System.out.println();
        System.out.println(ZonedDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z")));


    }
}
