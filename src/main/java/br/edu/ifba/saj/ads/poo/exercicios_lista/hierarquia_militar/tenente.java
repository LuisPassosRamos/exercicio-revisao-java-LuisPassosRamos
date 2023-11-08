package br.edu.ifba.saj.ads.poo.exercicios_lista.hierarquia_militar;

import java.util.ArrayList;

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

    public void addSubordinado(sargento sargento) {
        if(!subordinadosTenente.contains(sargento)){
            this.subordinadosTenente.add(sargento);
            sargento.setImediatoSargento(this);
        }
    }
}