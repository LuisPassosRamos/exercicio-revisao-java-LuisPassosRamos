package br.edu.ifba.saj.ads.poo.exercicios_lista.hierarquia_militar;

import java.util.ArrayList;
import java.util.Objects;

public class soldado {
    private String nomeSoldado;
    private int identificacaoSoldado;
    private int tempoServico;
    private cabo imediatoSoldado;

    public soldado(String nomeSoldado, int identificacaoSoldado, cabo imediatoSoldado) {
        this.nomeSoldado = nomeSoldado;
        this.identificacaoSoldado = identificacaoSoldado;
        this.tempoServico = 0;
        this.imediatoSoldado = imediatoSoldado;
    }

    public soldado(String nomeSoldado, int identificacaoSoldado) {
        this.nomeSoldado = nomeSoldado;
        this.identificacaoSoldado = identificacaoSoldado;
        this.tempoServico = 0;
    }

    public void setImediatoSoldado(cabo imediatoSoldado) {
        this.imediatoSoldado = imediatoSoldado;
        imediatoSoldado.addSubordinado(this);
    }

    public int getTempoServico() {
        return this.tempoServico;
    }

    public void incrementarTempoServico() {
        this.tempoServico++;
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

    @Override
    public String toString() {
        return "soldado{" +
                "nomeSoldado='" + nomeSoldado + '\'' +
                ", identificacaoSoldado=" + identificacaoSoldado +
                ", tempoServico=" + tempoServico +
                ", imediatoSoldado=" + imediatoSoldado +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof soldado soldado)) return false;
        return identificacaoSoldado == soldado.identificacaoSoldado && tempoServico == soldado.tempoServico && Objects.equals(nomeSoldado, soldado.nomeSoldado) && Objects.equals(imediatoSoldado, soldado.imediatoSoldado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeSoldado, identificacaoSoldado, tempoServico, imediatoSoldado);
    }
}
