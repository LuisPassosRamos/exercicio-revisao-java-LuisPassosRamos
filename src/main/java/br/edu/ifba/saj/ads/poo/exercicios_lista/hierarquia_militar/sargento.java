package br.edu.ifba.saj.ads.poo.exercicios_lista.hierarquia_militar;

import java.util.ArrayList;
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

    public void addSubordinado(cabo cabo){
        if(!this.subordinadosSargento.contains(cabo)){
            this.subordinadosSargento.add(cabo);
            cabo.setImediatoCabo(this);
        }
    }
}
