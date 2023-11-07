package br.edu.ifba.saj.ads.poo.exercicios_lista.hierarquia_militar;

import java.util.ArrayList;

public class soldado {
    private String nomeSoldado;
    private int identificacaoSoldado;
    private int tempoServico;
    private ArrayList<cabo> cabos;

    public soldado(String nomeSoldado, int identificacaoSoldado) {
        this.nomeSoldado = nomeSoldado;
        this.identificacaoSoldado = identificacaoSoldado;
        this.tempoServico = 0;
        this.cabos = new ArrayList<>();
    }

    public void addImediato(cabo cabo){
        cabo.addSubordinado(this);
        if (!this.cabos.contains(cabo)){
            this.cabos.add(cabo);
        }
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
