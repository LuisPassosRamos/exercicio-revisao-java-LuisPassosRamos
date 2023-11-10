package br.edu.ifba.saj.ads.poo.exercicios_lista.loja_roupas;

import java.util.Objects;

public class Roupa {
    private String nomeRoupa;
    private Departamento departamento;
    private float preco;

    private String tamanho;
    private String cor;

    public Roupa(String nomeRoupa, String tamanho, String cor) {
        this.nomeRoupa = nomeRoupa.toUpperCase().trim();
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public Roupa(String nomeRoupa, Departamento departamento, String cor, String tamanho, float preco){
        this.nomeRoupa = nomeRoupa.toUpperCase().trim();
        this.departamento = departamento;
        this.preco = preco;
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public Departamento getDepartamento() {
        return this.departamento;
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
        return "Roupa{" +
                "nomeRoupa='" + nomeRoupa + '\'' +
                ", preco=" + preco +
                ", tamanho=" + tamanho +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Roupa roupa)) return false;
        return Float.compare(preco, roupa.preco) == 0 && Objects.equals(nomeRoupa, roupa.nomeRoupa) && Objects.equals(departamento, roupa.departamento) && Objects.equals(tamanho, roupa.tamanho) && Objects.equals(cor, roupa.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeRoupa, departamento, preco, tamanho, cor);
    }
}
