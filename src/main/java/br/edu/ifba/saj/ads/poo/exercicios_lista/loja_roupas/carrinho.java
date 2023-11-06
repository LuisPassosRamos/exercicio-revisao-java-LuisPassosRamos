package br.edu.ifba.saj.ads.poo.exercicios_lista.loja_roupas;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class carrinho {
    ArrayList<roupa> roupas;

    carrinho(){
        this.roupas = new ArrayList<>();
    }

    public carrinho(ArrayList<roupa> roupas) {
        this.roupas = roupas;
    }

    public List<roupa> getRoupas() {
        return List.copyOf(this.roupas);
    }

    public void setRoupas(ArrayList<roupa> roupas) {
        this.roupas = roupas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof carrinho carrinho)) return false;
        return Objects.equals(roupas, carrinho.roupas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roupas);
    }
}
