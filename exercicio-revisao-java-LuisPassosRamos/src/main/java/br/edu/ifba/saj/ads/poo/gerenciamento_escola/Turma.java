package br.edu.ifba.saj.ads.poo.gerenciamento_escola;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Turma {
    int serie;
    ArrayList<Aluno> alunos;
    ArrayList<Professor> professores;

    public Turma(int serie, ArrayList<Aluno> alunos, ArrayList<Professor> professores) {
        this.serie = serie;
        this.alunos = (alunos == null) ?  alunos : new ArrayList<>();
        this.professores = professores;
    }

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

    public void addProfessor(Professor professor) {
        if(!professores.contains(professor)){
            professores.add(professor);
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + serie;
        result = prime * result + ((alunos == null) ? 0 : alunos.hashCode());
        result = prime * result + ((professores == null) ? 0 : professores.hashCode());
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
        Turma other = (Turma) obj;
        if (serie != other.serie)
            return false;
        if (alunos == null) {
            if (other.alunos != null)
                return false;
        } else if (!alunos.equals(other.alunos))
            return false;
        if (professores == null) {
            if (other.professores != null)
                return false;
        } else if (!professores.equals(other.professores))
            return false;
        return true;
    }

    
}