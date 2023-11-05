package br.edu.ifba.saj.ads.poo.exercicios_lista.loja_roupas;

import java.util.ArrayList;
import java.util.Objects;

public class departamento {
    String nomeDep;
    ArrayList<roupa> roupas;

    public departamento(String nomeDep) {
        this.nomeDep = nomeDep;
        this.roupas = new ArrayList<>();
    }

    public String getNomeDep() {
        return nomeDep;
    }
    
}
