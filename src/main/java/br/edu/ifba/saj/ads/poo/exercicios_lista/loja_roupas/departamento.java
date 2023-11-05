package br.edu.ifba.saj.ads.poo.exercicios_lista.loja_roupas;

import java.util.ArrayList;
import java.util.Objects;

public class departamento {
    String nomeDep;
    ArrayList<roupa> roupas;

    public departamento(String nomeDep) {
        this.nomeDep = nomeDep;
        this.roupas = new ArrayList<>();
    }

    public String getNomeDep() {
        return nomeDep;
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
