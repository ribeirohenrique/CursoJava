package entities;

import java.util.Objects;

public class Alunos {

    private Integer codAluno;

    public Alunos(Integer codAluno) {
        this.codAluno = codAluno;
    }

    public Integer getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(Integer codAluno) {
        this.codAluno = codAluno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alunos alunos = (Alunos) o;
        return codAluno.equals(alunos.codAluno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codAluno);
    }
}
