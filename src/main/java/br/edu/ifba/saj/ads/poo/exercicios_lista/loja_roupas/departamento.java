package br.edu.ifba.saj.ads.poo.exercicios_lista.loja_roupas;

import java.util.ArrayList;
import java.util.Objects;

public class departamento {
    String nomeDep;
    ArrayList<roupa> roupas;

    public departamento(String nomeDep, ArrayList<roupa> roupas) {
        this.nomeDep = nomeDep.toUpperCase().trim();
        this.roupas = roupas;
    }

    public departamento(String nomeDep) {
        this.nomeDep = nomeDep.toUpperCase().trim();
        this.roupas = new ArrayList<>();
    }

    public int getRoupasLenght(){
        return this.roupas.size();
    }

    public String getNomeDep() {
        return nomeDep;
    }

    public void addRoupa(roupa roupa){
        if (!this.roupas.contains(roupa)) {
           if(Objects.equals(roupa.getNomeRoupa(), this.getNomeDep())) {
               roupas.add(roupa);
           }
        }
    }

    @Override
    public String toString() {
        return "departamento{" +
                "nomeDep='" + nomeDep + '\'' +
                ", roupas=" + roupas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof departamento that)) return false;
        return Objects.equals(nomeDep, that.nomeDep) && Objects.equals(roupas, that.roupas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeDep, roupas);
    }
}
