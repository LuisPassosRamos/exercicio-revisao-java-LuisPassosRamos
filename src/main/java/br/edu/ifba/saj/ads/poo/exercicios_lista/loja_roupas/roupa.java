package br.edu.ifba.saj.ads.poo.exercicios_lista.loja_roupas;

import java.util.ArrayList;
import java.util.Objects;

public class roupa {
    private String nomeRoupa;
    private float preco;

    private String tamanho;
    private String cor;
    private ArrayList<departamento> departamentos;

    public roupa(String nomeRoupa, String tamanho, String cor) {
        this.nomeRoupa = nomeRoupa.toUpperCase().trim();
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public roupa(String nomeRoupa, String cor, String tamanho, float preco){
        this.nomeRoupa = nomeRoupa.toUpperCase().trim();
        this.preco = preco;
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public String getNomeRoupa() {
        return nomeRoupa;
    }
    public void setNomeRoupa(String nomeRoupa) {
        this.nomeRoupa = nomeRoupa;
    }

    public float getPreco() {
        return preco;
    }

    public String getCor() {
        return cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }


    @Override
    public String toString() {
        return "roupa{" +
                "nomeRoupa='" + nomeRoupa + '\'' +
                ", preco=" + preco +
                ", tamanho=" + tamanho +
                ", cor='" + cor + '\'' +
                '}';
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
