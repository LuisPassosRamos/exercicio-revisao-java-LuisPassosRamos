package br.edu.ifba.saj.ads.poo.exercicios_lista.hierarquia_militar;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class capitao {
    private String nomeSoldado;
    private int identificacaoSoldado;
    private int tempoServico;
    private ArrayList<tenente> subordinadosCapitao;

    public capitao(String nomeSoldado, int identificacaoSoldado, ArrayList<tenente> subordinadosCapitao) {
        this.nomeSoldado = nomeSoldado;
        this.identificacaoSoldado = identificacaoSoldado;
        this.tempoServico = 0;
        this.subordinadosCapitao = subordinadosCapitao;
    }

    public capitao(String nomeSoldado, int identificacaoSoldado) {
        this.nomeSoldado = nomeSoldado;
        this.identificacaoSoldado = identificacaoSoldado;
        this.tempoServico = 0;
        this.subordinadosCapitao = new ArrayList<>();
    }

    public void addSubordinados(tenente tenente) {
        if (!this.subordinadosCapitao.contains(tenente)){
            this.subordinadosCapitao.add(tenente);
        }
    }

    public List<tenente> getSubordinadosCapitao() {
        return List.copyOf(this.subordinadosCapitao);
    }

    public int getTempoServico() {
        return this.tempoServico;
    }

    public void incrementarTempoServico() {
        this.tempoServico++;
    }

    public String getNomeSoldado() {
        return nomeSoldado;
    }

    public void setNomeSoldado(String nomeSoldado) {
        this.nomeSoldado = nomeSoldado;
    }

    public int getIdentificacaoSoldado() {
        return identificacaoSoldado;
    }

    public void setIdentificacaoSoldado(int identificacaoSoldado) {
        this.identificacaoSoldado = identificacaoSoldado;
    }

    @Override
    public String toString() {
        return "capitao{" +
                "nomeSoldado='" + nomeSoldado + '\'' +
                ", identificacaoSoldado=" + identificacaoSoldado +
                ", tempoServico=" + tempoServico +
                ", subordinadosCapitao=" + subordinadosCapitao +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof capitao capitao)) return false;
        return identificacaoSoldado == capitao.identificacaoSoldado && tempoServico == capitao.tempoServico && Objects.equals(nomeSoldado, capitao.nomeSoldado) && Objects.equals(subordinadosCapitao, capitao.subordinadosCapitao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeSoldado, identificacaoSoldado, tempoServico, subordinadosCapitao);
    }
}
