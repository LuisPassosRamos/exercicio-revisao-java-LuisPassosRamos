package br.edu.ifba.saj.ads.poo.exercicios_lista.hierarquia_militar;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cabo {
    private String nomeCabo;
    private int identificacaoCabo;
    private int tempoServico;
    private ArrayList<Soldado> subordinadosCabo;
    private Sargento imediatoCabo;

    public Cabo(String nomeCabo, int identificacaoCabo, Sargento imediatoCabo) {
        this.nomeCabo = nomeCabo;
        this.identificacaoCabo = identificacaoCabo;
        this.imediatoCabo = imediatoCabo;
        this.tempoServico = 0;
        this.subordinadosCabo = new ArrayList<>();
    }

    public Cabo(String nomeCabo, int identificacaoCabo) {
        this.nomeCabo = nomeCabo;
        this.identificacaoCabo = identificacaoCabo;
        this.tempoServico = 0;
        this.subordinadosCabo = new ArrayList<>();
    }

    public Cabo(String nomeCabo, int identificacaoCabo, ArrayList<Soldado> subordinadosCabo, Sargento imediatoCabo) {
        this.nomeCabo = nomeCabo;
        this.identificacaoCabo = identificacaoCabo;
        this.tempoServico = 0;
        this.subordinadosCabo = subordinadosCabo;
        this.imediatoCabo = imediatoCabo;
    }

    public void setImediatoCabo(Sargento Sargento){
        Sargento.addSubordinado(this);
        this.imediatoCabo = Sargento;
    }

    public void addSubordinado(Soldado Soldado) {
        if (!this.subordinadosCabo.contains(Soldado)){
            this.subordinadosCabo.add(Soldado);
            Soldado.setImediatoSoldado(this);
        }
    }

    public int getTempoServico() {
        return this.tempoServico;
    }

    public void incrementarTempoServico() {
        this.tempoServico++;
    }

    public List<Soldado> getSubordinadosCabo() {
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

    @Override
    public String toString() {
        return "cabo{" +
                "nomeCabo='" + this.nomeCabo + '\'' +
                ", identificacaoCabo=" + this.identificacaoCabo +
                ", tempoServico=" + this.tempoServico +
                ", subordinadosCabo=" + this.subordinadosCabo +
                ", imediatoCabo=" + this.imediatoCabo.getNomeSargento() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cabo cabo)) return false;
        return identificacaoCabo == cabo.identificacaoCabo && tempoServico == cabo.tempoServico && Objects.equals(nomeCabo, cabo.nomeCabo) && Objects.equals(subordinadosCabo, cabo.subordinadosCabo) && Objects.equals(imediatoCabo, cabo.imediatoCabo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeCabo, identificacaoCabo, tempoServico, subordinadosCabo, imediatoCabo);
    }


}
