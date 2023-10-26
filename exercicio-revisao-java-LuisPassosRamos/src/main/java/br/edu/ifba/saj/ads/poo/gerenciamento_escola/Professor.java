package br.edu.ifba.saj.ads.poo.gerenciamento_escola;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Professor {
    String nomeProfessor;
    String materiaProfessor;
    ArrayList<Turma> turmas;

    public Professor(String nomeProfessor, String materiaProfessor, Turma turma) {
        this.nomeProfessor = nomeProfessor;
        this.materiaProfessor = materiaProfessor;
        this.turmas = new ArrayList<>();
        this.turmas.add(turma);
        turma.addProfessor(this);
    }

    public void addTurma(Turma turma) {
        if (!turmas.contains(turma)) {
            this.turmas.add(turma);
        }
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public String getMateriaProfessor() {
        return materiaProfessor;
    }

    public List<Turma> getTurmas() {
        return Collections.unmodifiableList(turmas);
    }

    @Override
    public String toString() {
        return "Professor [nomeProfessor=" + nomeProfessor + ", materiaProfessor=" + materiaProfessor + ", turmas="+ turmas + "]";
    }

}
