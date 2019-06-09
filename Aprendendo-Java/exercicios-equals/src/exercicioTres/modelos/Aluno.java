package exercicioTres.modelos;

import java.util.Objects;

public class Aluno {
    private String nome;
    private Integer numeroDoAluno;

    public Aluno(String nome, Integer numeroDoAluno) {
        this.nome = nome;
        this.numeroDoAluno = numeroDoAluno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome) &&
                Objects.equals(numeroDoAluno, aluno.numeroDoAluno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numeroDoAluno);
    }
}
