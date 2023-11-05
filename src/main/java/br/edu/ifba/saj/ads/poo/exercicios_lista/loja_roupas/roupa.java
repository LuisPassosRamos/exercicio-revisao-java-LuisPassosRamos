package br.edu.ifba.saj.ads.poo.exercicios_lista.loja_roupas;

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
}
