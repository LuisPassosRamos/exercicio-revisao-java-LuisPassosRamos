package br.edu.ifba.saj.ads.poo.exercicios_lista.loja_roupas;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Carrinho {
    ArrayList<Roupa> compras;

    public Carrinho(){
        this.compras = new ArrayList<>();
    }

    public Carrinho(ArrayList<Roupa> compras) {
        this.compras = compras;
    }

    public List<Roupa> getCompras() {
        return List.copyOf(this.compras);
    }

    public void limparRoupas(){
        this.compras.clear();
    }

    public void addRoupa(Roupa roupa){
        if (!this.compras.contains(roupa)){
            this.compras.add(roupa);
        }
    }

    @Override
    public String toString() {
        return "Carrinho{" +
                "Roupas=" + compras +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carrinho carrinho)) return false;
        return Objects.equals(compras, carrinho.compras);
    }

    @Override
    public int hashCode() {
        return Objects.hash(compras);
    }
}
