package br.edu.ifba.saj.ads.poo.exercicios_lista.gestao_projeto;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    private String nome;
    private List<Tarefa> tarefas;

    public Funcionario(String nome) {
        this.nome = nome;
        this.tarefas = new ArrayList<>();
    }

    public void setTarefa (Tarefa tarefa){
        if (!this.tarefas.contains(tarefa)){
            this.tarefas.add(tarefa);
        }
    }

    public String getNome() {
        return this.nome;
    }

    public List<Tarefa> getTarefas() {
        return List.copyOf(this.tarefas);
    }
    
}
