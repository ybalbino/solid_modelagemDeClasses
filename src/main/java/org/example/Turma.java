package org.example;

public class Turma {
    private String nome;
    private int numAlunos;

    public Turma(String nome, int numAlunos) {
        this.nome = nome;
        this.numAlunos = numAlunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumAlunos() {
        return numAlunos;
    }

    public void setNumAlunos(int numAlunos) {
        this.numAlunos = numAlunos;
    }
}
