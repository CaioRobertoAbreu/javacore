package br.com.java.java8.alura.streams;

public class Curso {
    private String nome;
    private Integer alunos;

    public Curso(String nome, Integer alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAlunos() {
        return alunos;
    }

    public void setAlunos(Integer alunos) {
        this.alunos = alunos;
    }
}
