package br.com.java.java8.alura.streams;

import java.util.*;

public class TesteCurso {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Java 8", 150));
        cursos.add(new Curso("JavaScript", 280));
        cursos.add(new Curso("Python", 89));
        cursos.add(new Curso("C#", 55));
        cursos.add(new Curso("DotNet", 105));

        System.out.println("Verificando quem tem mais de cem alunos");
        cursos.stream()
                .filter(curso -> curso.getAlunos() > 100)
                .forEach(c -> System.out.println(c.getNome() + " - " + c.getAlunos()));

        System.out.println("\nRealizando a Contagem de elementos");
        System.out.println(cursos.stream().count());

        System.out.println("\nPegando alunos de todos os cursos");
        cursos.stream()
                .map(curso -> curso.getAlunos())
                .forEach(curso -> System.out.println(curso));

        System.out.println("\nOrdenando pela quantidade de alunos usando método sort");
//        cursos.sort((alunos1, alunos2) -> alunos1.getAlunos() - alunos2.getAlunos()); -> Exemplo para atributos int

        cursos.sort((alunos1, alunos2) -> alunos1.getAlunos().compareTo(alunos2.getAlunos()));
        cursos.forEach(curso -> System.out.println(curso.getNome() + " - " + curso.getAlunos()));

        //Usando STREAM
        System.out.println("\nRealizando Ordenação");
        cursos.stream()
                .sorted((a1, a2) -> a1.getAlunos().compareTo(a2.getAlunos()))
                .forEach(aluno -> System.out.println(aluno.getAlunos()));

        System.out.println("\nImprimindo total de alunos");
        int soma = cursos.stream().mapToInt(c -> c.getAlunos()).sum();
        System.out.println("Total: " + soma);
    }
}
