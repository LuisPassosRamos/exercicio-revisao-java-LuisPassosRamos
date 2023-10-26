package br.edu.ifba.saj.ads.poo.gerenciamento_escola;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Turma {
    int serie;
    ArrayList<Aluno> alunos;
    ArrayList<Professor> professores;

    public Turma(int serie) {
        this.serie = serie;
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
    }

    public void addAluno(Aluno aluno) {
        if (!this.alunos.contains(aluno)) {
            this.alunos.add(aluno);
        }
    }

    public int getSerie() {
        return serie;
    }

    public List<Professor> getProfessores() {
        return Collections.unmodifiableList(professores);
    }

    public List<Aluno> getAlunos() {
        return Collections.unmodifiableList(alunos);
    }

    @Override
    public String toString() {
        return "Turma [serie=" + serie + ", alunos=" + alunos + "]";
    }
}