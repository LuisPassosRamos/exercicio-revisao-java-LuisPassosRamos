package br.edu.ifba.saj.ads.poo.exercicios_lista.loja_roupas;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private ArrayList<Roupa> compras;

    public Carrinho() {
        this.compras = new ArrayList<>();
    }

    public Carrinho(ArrayList<Roupa> compras) {
        if (compras != null) {
            this.compras = compras;
        }
    }

    public List<Roupa> getCompras() {
        return List.copyOf(this.compras);
    }

    public void limparRoupas() {
        this.compras.clear();
    }

    public void addRoupa(Roupa roupa) {
        if (!this.compras.contains(roupa)) {
            this.compras.add(roupa);
        }
    }

    @Override
    public String toString() {
        return "Carrinho [compras=" + compras + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((compras == null) ? 0 : compras.hashCode());
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
        Carrinho other = (Carrinho) obj;
        if (compras == null) {
            if (other.compras != null)
                return false;
        } else if (!compras.equals(other.compras))
            return false;
        return true;
    }
}
