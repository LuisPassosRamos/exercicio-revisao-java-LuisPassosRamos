package br.edu.ifba.saj.ads.poo.exercicios_lista.hierarquia_militar;

import java.util.ArrayList;
import java.util.Objects;

public class cabo {
    private String nomeCabo;
    private int identificacaoCabo;
    private int tempoServico;
    private ArrayList<soldado> subordinadosCabo;
    private sargento imediatoCabo;

    public cabo(String nomeCabo, int identificacaoCabo, sargento imediatoCabo) {
        this.nomeCabo = nomeCabo;
        this.identificacaoCabo = identificacaoCabo;
        this.imediatoCabo = imediatoCabo;
        this.tempoServico = 0;
        this.subordinadosCabo = new ArrayList<>();
    }

    public cabo(String nomeCabo, int identificacaoCabo) {
        this.nomeCabo = nomeCabo;
        this.identificacaoCabo = identificacaoCabo;
        this.tempoServico = 0;
        this.subordinadosCabo = new ArrayList<>();
    }

    public void setImediatoCabo(sargento sargento){
        sargento.addSubordinado(this);
        this.imediatoCabo = sargento;
    }

    public void addSubordinado(soldado soldado) {
        if (!this.subordinadosCabo.contains(soldado)){
            this.subordinadosCabo.add(soldado);
            soldado.setImediatoSoldado(this);
        }
    }

    @Override
    public String toString() {
        return "cabo{" +
                "nomeCabo='" + nomeCabo + '\'' +
                ", identificacaoCabo=" + identificacaoCabo +
                ", tempoServico=" + tempoServico +
                ", subordinadosCabo=" + subordinadosCabo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof cabo cabo)) return false;
        return identificacaoCabo == cabo.identificacaoCabo && tempoServico == cabo.tempoServico && Objects.equals(nomeCabo, cabo.nomeCabo) && Objects.equals(subordinadosCabo, cabo.subordinadosCabo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeCabo, identificacaoCabo, tempoServico, subordinadosCabo);
    }
}
