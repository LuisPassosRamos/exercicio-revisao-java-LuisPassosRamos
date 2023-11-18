package br.edu.ifba.saj.ads.poo.exercicios_lista.loja_roupas;

import java.util.ArrayList;
import java.util.List;
public class Departamento {
    
    private String nomeDep;
    private ArrayList<Roupa> roupas;

    public Departamento(String nomeDep) {
        this.nomeDep = nomeDep.toUpperCase().trim();
        this.roupas = new ArrayList<>();
    }

    public void addRoupa(Roupa roupa){
        if (!this.roupas.contains(roupa)){
            roupas.add(roupa);
        }
    }

    public List<Roupa> getRoupas(){
        return List.copyOf(this.roupas);
    }

    public int getRoupasSize(){
        return this.roupas.size();
    }

    public String getNomeDep() {
        return nomeDep;
    }

    @Override
    public String toString() {
        return "Departamento [nomeDep=" + nomeDep + ", Roupas=" + roupas + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nomeDep == null) ? 0 : nomeDep.hashCode());
        result = prime * result + ((roupas == null) ? 0 : roupas.hashCode());
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
        Departamento other = (Departamento) obj;
        if (nomeDep == null) {
            if (other.nomeDep != null)
                return false;
        } else if (!nomeDep.equals(other.nomeDep))
            return false;
        if (roupas == null) {
            if (other.roupas != null)
                return false;
        } else if (!roupas.equals(other.roupas))
            return false;
        return true;
    }
}
