package br.edu.ifba.saj.ads.poo.exercicios_lista.gerenciamento_escola;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Professor {
    String nomeProfessor;
    String materiaProfessor;
    ArrayList<Turma> turmas;

    public Professor(String nomeProfessor, String materiaProfessor) {
        this.nomeProfessor = nomeProfessor;
        this.materiaProfessor = materiaProfessor;
        this.turmas = new ArrayList<>();
    }

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
        return "\nProfessor [Nome do professor=" + nomeProfessor + ", Materia do professor=" + materiaProfessor + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nomeProfessor == null) ? 0 : nomeProfessor.hashCode());
        result = prime * result + ((materiaProfessor == null) ? 0 : materiaProfessor.hashCode());
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
        Professor other = (Professor) obj;
        if (nomeProfessor == null) {
            if (other.nomeProfessor != null)
                return false;
        } else if (!nomeProfessor.equals(other.nomeProfessor))
            return false;
        if (materiaProfessor == null) {
            if (other.materiaProfessor != null)
                return false;
        } else if (!materiaProfessor.equals(other.materiaProfessor))
            return false;
        if (turmas == null) {
            if (other.turmas != null)
                return false;
        } else if (!turmas.equals(other.turmas))
            return false;
        return true;
    }

}
