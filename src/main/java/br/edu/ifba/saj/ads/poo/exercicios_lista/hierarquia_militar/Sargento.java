package br.edu.ifba.saj.ads.poo.exercicios_lista.hierarquia_militar;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sargento {
    private String nomeSargento;
    private int identificacaoSargento;
    private int tempoServico;
    private Tenente imediatoSargento;
    private ArrayList<Cabo> subordinadosSargento;

    public Sargento(String nomeSargento, int identificacaoSargento, Tenente imediatoSargento) {
        this.nomeSargento = nomeSargento;
        this.identificacaoSargento = identificacaoSargento;
        this.imediatoSargento = imediatoSargento;
        this.subordinadosSargento = new ArrayList<>();
        this.tempoServico = 0;
    }

    public Sargento(String nomeSargento, int identificacaoSargento) {
        this.nomeSargento = nomeSargento;
        this.identificacaoSargento = identificacaoSargento;
        this.subordinadosSargento = new ArrayList<>();
        this.tempoServico = 0;
    }

    public Sargento(String nomeSargento, int identificacaoSargento, Tenente imediatoSargento, ArrayList<Cabo> subordinadosSargento) {
        this.nomeSargento = nomeSargento;
        this.identificacaoSargento = identificacaoSargento;
        this.tempoServico = 0;
        this.imediatoSargento = imediatoSargento;
        this.subordinadosSargento = subordinadosSargento;
    }

    public void addSubordinado(Cabo cabo){
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

    public Tenente getImediatoSargento() {
        return this.imediatoSargento;
    }

    public void setImediatoSargento(Tenente imediatoSargento) {
        this.imediatoSargento = imediatoSargento;
        imediatoSargento.addSubordinado(this);
    }

    public List<Cabo> getSubordinadosSargento() {
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
        return "Sargento{" +
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
        if (!(o instanceof Sargento Sargento)) return false;
        return identificacaoSargento == Sargento.identificacaoSargento && tempoServico == Sargento.tempoServico && Objects.equals(nomeSargento, Sargento.nomeSargento) && Objects.equals(imediatoSargento, Sargento.imediatoSargento) && Objects.equals(subordinadosSargento, Sargento.subordinadosSargento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeSargento, identificacaoSargento, tempoServico, imediatoSargento, subordinadosSargento);
    }
}
