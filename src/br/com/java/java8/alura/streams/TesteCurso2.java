package br.com.java.java8.alura.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TesteCurso2 {
    public static void main(String[] args) {
        List<Curso> cursos2 = new ArrayList<>();
        cursos2.add(new Curso("Java 8", 150));
        cursos2.add(new Curso("JavaScript", 280));
        cursos2.add(new Curso("Python", 89));
        cursos2.add(new Curso("C#", 55));
        cursos2.add(new Curso("DotNet", 105));

        cursos2.stream()
                .filter(c -> c.getAlunos() >= 100)
                .findAny()
                .ifPresent(c -> System.out.println(c.getNome()));

        //Retornando uma List de acordo com meu critério
        List<Curso> novoCursos2 = cursos2.stream()
                .filter(c -> c.getAlunos() >= 70)
                .collect(Collectors.toList()); //Dava pra usar um forEach direto

        System.out.println();
        novoCursos2.forEach(c -> System.out.println(c.getNome() + " " +
                c.getAlunos()));

    }
}
