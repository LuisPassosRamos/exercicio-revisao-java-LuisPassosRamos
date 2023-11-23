package br.edu.ifba.saj.ads.poo.exercicios_lista.hierarquia_militar;

import java.util.Objects;

public class Soldado {
    private String nomeSoldado;
    private int identificacaoSoldado;
    private int tempoServico;
    private Cabo imediatoSoldado;

    public Soldado(String nomeSoldado, int identificacaoSoldado, Cabo imediatoSoldado) {
        this.nomeSoldado = nomeSoldado;
        this.identificacaoSoldado = identificacaoSoldado;
        this.tempoServico = 0;
        this.imediatoSoldado = imediatoSoldado;
    }

    public Soldado(String nomeSoldado, int identificacaoSoldado) {
        this.nomeSoldado = nomeSoldado;
        this.identificacaoSoldado = identificacaoSoldado;
        this.tempoServico = 0;
    }

    public void setImediatoSoldado(Cabo imediatoSoldado) {
        if (!Objects.equals(this.imediatoSoldado, imediatoSoldado)) {
            this.imediatoSoldado = imediatoSoldado;
            imediatoSoldado.addSubordinado(this);
        }
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
                "nomeSoldado='" + this.nomeSoldado + '\'' +
                ", identificacaoSoldado=" + this.identificacaoSoldado +
                ", tempoServico=" + this.tempoServico +
                ", imediatoSoldado=" + this.imediatoSoldado.getNomeCabo() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Soldado soldado)) return false;
        return identificacaoSoldado == soldado.identificacaoSoldado && tempoServico == soldado.tempoServico && Objects.equals(nomeSoldado, soldado.nomeSoldado) && Objects.equals(imediatoSoldado, soldado.imediatoSoldado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeSoldado, identificacaoSoldado, tempoServico, imediatoSoldado);
    }
}
