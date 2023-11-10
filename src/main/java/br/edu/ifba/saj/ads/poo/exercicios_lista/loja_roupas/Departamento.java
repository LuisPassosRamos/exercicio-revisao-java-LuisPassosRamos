package br.edu.ifba.saj.ads.poo.exercicios_lista.loja_roupas;

import java.util.ArrayList;
import java.util.Objects;
import java.util.List;
public class Departamento {
    String nomeDep;
    ArrayList<Roupa> Roupas;

    public Departamento(String nomeDep, ArrayList<Roupa> Roupas) {
        this.nomeDep = nomeDep.toUpperCase().trim();
        this.Roupas = Roupas;
    }

    public Departamento(String nomeDep) {
        this.nomeDep = nomeDep.toUpperCase().trim();
        this.Roupas = new ArrayList<>();
    }

    public List<Roupa> getRoupas(){
        return List.copyOf(this.Roupas);
    }

    public int getRoupasSize(){
        return this.Roupas.size();
    }

    public String getNomeDep() {
        return nomeDep;
    }

    public void addRoupa(Roupa roupa){
        if (!this.Roupas.contains(roupa)) {
           if(Objects.equals(roupa.getDepartamento(), this.getNomeDep())) {
               Roupas.add(roupa);
           }
        }
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nomeDep='" + nomeDep + '\'' +
                ", Roupas=" + Roupas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Departamento that)) return false;
        return Objects.equals(nomeDep, that.nomeDep) && Objects.equals(Roupas, that.Roupas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeDep, Roupas);
    }
}
