package br.edu.ifba.saj.ads.poo.exercicios_lista.hierarquia_militar;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Tenente {
    private String nomeTenente;
    private int identificacaoTenente;
    private int tempoServico;
    private ArrayList<Sargento> subordinadosTenente;
    private Capitao imediatoTenente;

    public Tenente(String nomeTenente, int identificacaoTenente, Capitao imediatoTenente) {
        this.nomeTenente = nomeTenente;
        this.identificacaoTenente = identificacaoTenente;
        this.tempoServico = 0;
        this.imediatoTenente = imediatoTenente;
        this.subordinadosTenente = new ArrayList<>();
    }

    public Tenente(String nomeTenente, int identificacaoTenente, ArrayList<Sargento> subordinadosTenente, Capitao imediatoTenente) {
        this.nomeTenente = nomeTenente;
        this.identificacaoTenente = identificacaoTenente;
        this.tempoServico = 0;
        this.subordinadosTenente = subordinadosTenente;
        this.imediatoTenente = imediatoTenente;
    }

    public Tenente(String nomeTenente, int identificacaoTenente) {
        this.nomeTenente = nomeTenente;
        this.identificacaoTenente = identificacaoTenente;
        this.tempoServico = 0;
        this.subordinadosTenente = new ArrayList<>();
    }

    public void setImediatoTenente(Capitao capitao){
        this.imediatoTenente = capitao;
        capitao.addSubordinado(this);
    }

    public void addSubordinado(Sargento Sargento) {
        if(!subordinadosTenente.contains(Sargento)){
            this.subordinadosTenente.add(Sargento);
            Sargento.setImediatoSargento(this);
        }
    }

    public List<Sargento> getSubordinadosTenente() {
        return List.copyOf(this.subordinadosTenente);
    }

    public Capitao getImediatoTenente() {
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
        return "Tenente{" +
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
        if (!(o instanceof Tenente Tenente)) return false;
        return identificacaoTenente == Tenente.identificacaoTenente && tempoServico == Tenente.tempoServico && Objects.equals(nomeTenente, Tenente.nomeTenente) && Objects.equals(subordinadosTenente, Tenente.subordinadosTenente) && Objects.equals(imediatoTenente, Tenente.imediatoTenente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeTenente, identificacaoTenente, tempoServico, subordinadosTenente, imediatoTenente);
    }
}