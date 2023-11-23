package br.edu.ifba.saj.ads.poo.exercicios_lista.hierarquia_militar;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Capitao {
    private String nomeCapitao;
    private int identificacaoCapitao;
    private int tempoServico;
    private ArrayList<Tenente> subordinadosCapitao;

    public Capitao(String nomeCapitao, int identificacaoCapitao, ArrayList<Tenente> subordinadosCapitao) {
        this.nomeCapitao = nomeCapitao;
        this.identificacaoCapitao = identificacaoCapitao;
        this.tempoServico = 0;
        this.subordinadosCapitao = subordinadosCapitao;
    }

    public Capitao(String nomeCapitao, int identificacaoCapitao) {
        this.nomeCapitao = nomeCapitao;
        this.identificacaoCapitao = identificacaoCapitao;
        this.tempoServico = 0;
        this.subordinadosCapitao = new ArrayList<>();
    }

    public void addSubordinado(Tenente Tenente) {
        if (!this.subordinadosCapitao.contains(Tenente)){
            this.subordinadosCapitao.add(Tenente);
            Tenente.setImediatoTenente(this);
        }
    }

    public List<Tenente> getSubordinadosCapitao() {
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
        return "Capitao{" +
                "nomeCapitao='" + nomeCapitao + '\'' +
                ", identificacaoCapitao=" + identificacaoCapitao +
                ", tempoServico=" + tempoServico +
                ", subordinadosCapitao=" + subordinadosCapitao +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Capitao Capitao)) return false;
        return identificacaoCapitao == Capitao.identificacaoCapitao && tempoServico == Capitao.tempoServico && Objects.equals(nomeCapitao, Capitao.nomeCapitao) && Objects.equals(subordinadosCapitao, Capitao.subordinadosCapitao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeCapitao, identificacaoCapitao, tempoServico, subordinadosCapitao);
    }
}
