package br.edu.ifba.saj.ads.poo.exercicios_lista.hierarquia_militar;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class capitao {
    private String nomeCapitao;
    private int identificacaoCapitao;
    private int tempoServico;
    private ArrayList<tenente> subordinadosCapitao;

    public capitao(String nomeCapitao, int identificacaoCapitao, ArrayList<tenente> subordinadosCapitao) {
        this.nomeCapitao = nomeCapitao;
        this.identificacaoCapitao = identificacaoCapitao;
        this.tempoServico = 0;
        this.subordinadosCapitao = subordinadosCapitao;
    }

    public capitao(String nomeCapitao, int identificacaoCapitao) {
        this.nomeCapitao = nomeCapitao;
        this.identificacaoCapitao = identificacaoCapitao;
        this.tempoServico = 0;
        this.subordinadosCapitao = new ArrayList<>();
    }

    public void addSubordinado(tenente tenente) {
        if (!this.subordinadosCapitao.contains(tenente)){
            this.subordinadosCapitao.add(tenente);
            tenente.setImediatoTenente(this);
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

    public String getNomeCapitao() {
        return nomeCapitao;
    }

    public void setNomeCapitao(String nomeCapitao) {
        this.nomeCapitao = nomeCapitao;
    }

    public int getIdentificacaoCapitao() {
        return identificacaoCapitao;
    }

    public void setIdentificacaoCapitao(int identificacaoCapitao) {
        this.identificacaoCapitao = identificacaoCapitao;
    }

    @Override
    public String toString() {
        return "capitao{" +
                "nomeCapitao='" + nomeCapitao + '\'' +
                ", identificacaoCapitao=" + identificacaoCapitao +
                ", tempoServico=" + tempoServico +
                ", subordinadosCapitao=" + subordinadosCapitao +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof capitao capitao)) return false;
        return identificacaoCapitao == capitao.identificacaoCapitao && tempoServico == capitao.tempoServico && Objects.equals(nomeCapitao, capitao.nomeCapitao) && Objects.equals(subordinadosCapitao, capitao.subordinadosCapitao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeCapitao, identificacaoCapitao, tempoServico, subordinadosCapitao);
    }
}
