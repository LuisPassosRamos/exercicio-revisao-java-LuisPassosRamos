package br.edu.ifba.saj.ads.poo.gerenciamento_escola;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aluno {
    String nomeAluno;
    int matriculaAluno;
    ArrayList<Turma> turmas;

    public Aluno(String nomeAluno, int matriculaAluno, Turma turma) {
        this.nomeAluno = nomeAluno;
        this.matriculaAluno = matriculaAluno;
        this.turmas = new ArrayList<>();
        this.turmas.add(turma);
        turma.addAluno(this);
    }

    public void matricularTurma(Turma turma) {
        this.turmas.add(turma);
        if (!this.turmas.contains(turma)) {
            turma.addAluno(this);
        }
    }

    public String getNomeAluno(){
        return this.nomeAluno;
    }

    public int getMatriculaAluno() {
        return this.matriculaAluno;
    }

    public List<Turma> getTurmas() {
        return Collections.unmodifiableList(turmas);
    }

    @Override
    public String toString() {
        return "Aluno [nomeAluno=" + nomeAluno + ", matriculaAluno=" + matriculaAluno + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nomeAluno == null) ? 0 : nomeAluno.hashCode());
        result = prime * result + matriculaAluno;
        result = prime * result + ((turmas == null) ? 0 : turmas.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (nomeAluno == null) {
            if (other.nomeAluno != null)
                return false;
        } else if (!nomeAluno.equals(other.nomeAluno))
            return false;
        if (matriculaAluno != other.matriculaAluno)
            return false;
        if (turmas == null) {
            if (other.turmas != null)
                return false;
        } else if (!turmas.equals(other.turmas))
            return false;
        return true;
    }

    

}
