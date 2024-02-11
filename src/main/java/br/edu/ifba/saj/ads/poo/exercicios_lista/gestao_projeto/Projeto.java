package br.edu.ifba.saj.ads.poo.exercicios_lista.gestao_projeto;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private List<Tarefa> tarefas;
    private List<Funcionario> equipe;

    public Projeto() {
        this.tarefas = new ArrayList<>();
        this.equipe = new ArrayList<>();
    }

    public void setTarefas(Tarefa tarefa) {
        if(!this.tarefas.contains(tarefa) && tarefa.getStatus() != Status.CONCLUIDA){
            this.tarefas.add(tarefa);
        }
    }

    public void setEquipe(Funcionario funcionario) {
        if(!this.equipe.contains(funcionario)){
            this.equipe.add(funcionario);
        }
    }

    public double getProgresso (){
        double contador = 0.0;
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getStatus() == Status.CONCLUIDA) {
                contador++;
            }
        }
        return (contador*100)/this.tarefas.size();
    }

}
