package br.edu.ifba.saj.ads.poo.exercicios_lista.hierarquia_militar;

public class capitao {
    private String nomeSoldado;
    private int identificacaoSoldado;
    private int tempoServico;



    public int getTempoServico() {
        return this.tempoServico;
    }

    public void incrementarTempoServico() {
        this.tempoServico++;
    }

}
