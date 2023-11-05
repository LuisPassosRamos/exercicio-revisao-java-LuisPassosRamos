package br.edu.ifba.saj.ads.poo.exercicios_lista.loja_roupas;

import java.util.Objects;

public class roupa {
    private float preco;

    private char tamanho;
    private String cor;

    roupa(float preco, char tamanho, String cor){
        this.preco = preco;
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public float getPreco() {
        return preco;
    }

    public String getCor() {
        return cor;
    }

    public char getTamanho() {
        return tamanho;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof roupa roupa)) return false;
        return Float.compare(preco, roupa.preco) == 0 && tamanho == roupa.tamanho && Objects.equals(cor, roupa.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(preco, tamanho, cor);
    }
}
