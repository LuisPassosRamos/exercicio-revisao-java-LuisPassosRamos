package br.edu.ifba.saj.ads.poo.exercicios_lista.hierarquia_militar;

import java.util.ArrayList;
import java.util.List;
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

    public cabo(String nomeCabo, int identificacaoCabo, ArrayList<soldado> subordinadosCabo, sargento imediatoCabo) {
        this.nomeCabo = nomeCabo;
        this.identificacaoCabo = identificacaoCabo;
        this.tempoServico = 0;
        this.subordinadosCabo = subordinadosCabo;
        this.imediatoCabo = imediatoCabo;
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

    public int getTempoServico() {
        return this.tempoServico;
    }

    public void incrementarTempoServico() {
        this.tempoServico++;
    }

    public List<soldado> getSubordinadosCabo() {
        return List.copyOf(this.subordinadosCabo);
    }

    public String getNomeCabo() {
        return this.nomeCabo;
    }

    public void setNomeCabo(String nomeCabo) {
        this.nomeCabo = nomeCabo;
    }

    public int getIdentificacaoCabo() {
        return this.identificacaoCabo;
    }

    public void setIdentificacaoCabo(int identificacaoCabo) {
        this.identificacaoCabo = identificacaoCabo;
    }
}
