package br.com.java.java8.dateapi;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeAlura {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora);

        Year ano = Year.from(agora); //ou of
        System.out.println("Somente ano: " + ano);

        System.out.println("Adicionando 9 horas: " +
                agora.plusHours(9).format(DateTimeFormatter.ofPattern("dd/MM/yy HH:mm")));
        System.out.println("Transformando para LocalDate: " + agora.toLocalDate()); //Dá pra fazer o inverso tbm com LocalDate

        LocalTime almoco = LocalTime.of(12, 0);
        System.out.println("Horario do Almoço: " + almoco);
    }
}
