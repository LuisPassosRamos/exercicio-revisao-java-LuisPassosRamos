package br.edu.ifba.saj.ads.poo.exercicios_lista.hierarquia_militar;

public class soldado {
    private String nomeSoldado;
    private int identificacaoSoldado;
    private int tempoServico;

    public soldado(String nomeSoldado, int identificacaoSoldado) {
        this.nomeSoldado = nomeSoldado;
        this.identificacaoSoldado = identificacaoSoldado;
        this.tempoServico = 0;
    }

    public String getNomeSoldado() {
        return this.nomeSoldado;
    }

    public void setNomeSoldado(String nomeSoldado) {
        this.nomeSoldado = nomeSoldado;
    }

    public int getIdentificacaoSoldado() {
        return this.identificacaoSoldado;
    }

    public void setIdentificacaoSoldado(int identificacaoSoldado) {
        this.identificacaoSoldado = identificacaoSoldado;
    }
}
