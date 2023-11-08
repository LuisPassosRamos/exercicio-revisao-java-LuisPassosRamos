package br.edu.ifba.saj.ads.poo.exercicios_lista.hierarquia_militar;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class sargento {
    private String nomeSargento;
    private int identificacaoSargento;
    private int tempoServico;
    private tenente imediatoSargento;
    private ArrayList<cabo> subordinadosSargento;

    public sargento(String nomeSargento, int identificacaoSargento, tenente imediatoSargento) {
        this.nomeSargento = nomeSargento;
        this.identificacaoSargento = identificacaoSargento;
        this.imediatoSargento = imediatoSargento;
        this.subordinadosSargento = new ArrayList<>();
        this.tempoServico = 0;
    }

    public sargento(String nomeSargento, int identificacaoSargento) {
        this.nomeSargento = nomeSargento;
        this.identificacaoSargento = identificacaoSargento;
        this.subordinadosSargento = new ArrayList<>();
        this.tempoServico = 0;
    }

    public sargento(String nomeSargento, int identificacaoSargento, tenente imediatoSargento, ArrayList<cabo> subordinadosSargento) {
        this.nomeSargento = nomeSargento;
        this.identificacaoSargento = identificacaoSargento;
        this.tempoServico = 0;
        this.imediatoSargento = imediatoSargento;
        this.subordinadosSargento = subordinadosSargento;
    }

    public void addSubordinado(cabo cabo){
        if(!this.subordinadosSargento.contains(cabo)){
            this.subordinadosSargento.add(cabo);
            cabo.setImediatoCabo(this);
        }
    }

    public int getTempoServico() {
        return this.tempoServico;
    }

    public void incrementarTempoServico() {
        this.tempoServico++;
    }

    public tenente getImediatoSargento() {
        return this.imediatoSargento;
    }

    public void setImediatoSargento(tenente imediatoSargento) {
        this.imediatoSargento = imediatoSargento;
        imediatoSargento.addSubordinado(this);
    }

    public List<cabo> getSubordinadosSargento() {
        return List.copyOf(this.subordinadosSargento);
    }

    public String getNomeSargento() {
        return this.nomeSargento;
    }

    public void setNomeSargento(String nomeSargento) {
        this.nomeSargento = nomeSargento;
    }

    public int getIdentificacaoSargento() {
        return this.identificacaoSargento;
    }

    public void setIdentificacaoSargento(int identificacaoSargento) {
        this.identificacaoSargento = identificacaoSargento;
    }

    @Override
    public String toString() {
        return "sargento{" +
                "nomeSargento='" + this.nomeSargento + '\'' +
                ", identificacaoSargento=" + this.identificacaoSargento +
                ", tempoServico=" + this.tempoServico +
                ", imediatoSargento=" + this.imediatoSargento.getNomeTenente() +
                ", subordinadosSargento=" + this.subordinadosSargento +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof sargento sargento)) return false;
        return identificacaoSargento == sargento.identificacaoSargento && tempoServico == sargento.tempoServico && Objects.equals(nomeSargento, sargento.nomeSargento) && Objects.equals(imediatoSargento, sargento.imediatoSargento) && Objects.equals(subordinadosSargento, sargento.subordinadosSargento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeSargento, identificacaoSargento, tempoServico, imediatoSargento, subordinadosSargento);
    }
}
