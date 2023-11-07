package br.edu.ifba.saj.ads.poo.exercicios_lista.hierarquia_militar;

import java.util.ArrayList;

public class cabo {
    private String nomeCabo;
    private int identificacaoCabo;
    private int tempoServico;
    private ArrayList<soldado> subordinadosCabo;

    public cabo(String nomeCabo, int identificacaoCabo) {
        this.nomeCabo = nomeCabo;
        this.identificacaoCabo = identificacaoCabo;
        this.tempoServico = 0;
        this.subordinadosCabo = new ArrayList<>();
    }

    public void addSubordinado(soldado soldado) {
        if (!this.subordinadosCabo.contains(soldado)){
            this.subordinadosCabo.add(soldado);
        }
    }
}
