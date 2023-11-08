package br.edu.ifba.saj.ads.poo.exercicios_lista.hierarquia_militar;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class tenente {
    private String nomeTenente;
    private int identificacaoTenente;
    private int tempoServico;
    private ArrayList<sargento> subordinadosTenente;
    private capitao imediatoTenente;

    public tenente(String nomeTenente, int identificacaoTenente, capitao imediatoTenente) {
        this.nomeTenente = nomeTenente;
        this.identificacaoTenente = identificacaoTenente;
        this.tempoServico = 0;
        this.imediatoTenente = imediatoTenente;
        this.subordinadosTenente = new ArrayList<>();
    }

    public tenente(String nomeTenente, int identificacaoTenente, ArrayList<sargento> subordinadosTenente, capitao imediatoTenente) {
        this.nomeTenente = nomeTenente;
        this.identificacaoTenente = identificacaoTenente;
        this.tempoServico = 0;
        this.subordinadosTenente = subordinadosTenente;
        this.imediatoTenente = imediatoTenente;
    }

    public tenente(String nomeTenente, int identificacaoTenente) {
        this.nomeTenente = nomeTenente;
        this.identificacaoTenente = identificacaoTenente;
        this.tempoServico = 0;
        this.subordinadosTenente = new ArrayList<>();
    }

    public void setImediatoTenente(capitao capitao){
        this.imediatoTenente = capitao;
        capitao.addSubordinado(this);
    }

    public void addSubordinado(sargento sargento) {
        if(!subordinadosTenente.contains(sargento)){
            this.subordinadosTenente.add(sargento);
            sargento.setImediatoSargento(this);
        }
    }

    public List<sargento> getSubordinadosTenente() {
        return List.copyOf(this.subordinadosTenente);
    }

    public capitao getImediatoTenente() {
        return this.imediatoTenente;
    }

    public int getTempoServico() {
        return this.tempoServico;
    }

    public void incrementarTempoServico() {
        this.tempoServico++;
    }

    public String getNomeTenente() {
        return this.nomeTenente;
    }

    public void setNomeTenente(String nomeTenente) {
        this.nomeTenente = nomeTenente;
    }

    public int getIdentificacaoTenente() {
        return this.identificacaoTenente;
    }

    public void setIdentificacaoTenente(int identificacaoTenente) {
        this.identificacaoTenente = identificacaoTenente;
    }

    @Override
    public String toString() {
        return "tenente{" +
                "nomeTenente='" + this.nomeTenente + '\'' +
                ", identificacaoTenente=" + this.identificacaoTenente +
                ", tempoServico=" + this.tempoServico +
                ", subordinadosTenente=" + this.subordinadosTenente +
                ", imediatoTenente=" + this.imediatoTenente.getNomeCapitao() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof tenente tenente)) return false;
        return identificacaoTenente == tenente.identificacaoTenente && tempoServico == tenente.tempoServico && Objects.equals(nomeTenente, tenente.nomeTenente) && Objects.equals(subordinadosTenente, tenente.subordinadosTenente) && Objects.equals(imediatoTenente, tenente.imediatoTenente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeTenente, identificacaoTenente, tempoServico, subordinadosTenente, imediatoTenente);
    }
}