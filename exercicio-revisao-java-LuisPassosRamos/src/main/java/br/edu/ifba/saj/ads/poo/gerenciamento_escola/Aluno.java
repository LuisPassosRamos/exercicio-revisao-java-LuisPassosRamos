package br.edu.ifba.saj.ads.poo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aluno {
    String nomeAluno;
    int matriculaAluno;
    ArrayList<Turma> turmas;

    public Aluno(String nomeAluno, int matriculaAluno) {
        this.nomeAluno = nomeAluno;
        this.matriculaAluno = matriculaAluno;
        this.turmas = new ArrayList<>();
    }

    public void matricularTurma(Turma turma) {
        this.turmas.add(turma);
        if (!this.turmas.contains(turma)) {
            turma.addAluno(this);
        }
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public int getMatriculaAluno() {
        return matriculaAluno;
    }

    public List<Turma> getTurmas() {
        return Collections.unmodifiableList(turmas);
    }
}
