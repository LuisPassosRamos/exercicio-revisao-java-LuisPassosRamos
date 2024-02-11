package br.edu.ifba.saj.ads.poo.exercicios_lista.gestao_projeto;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Tarefa> tarefas = new ArrayList<>();
        Tarefa tarefa1 = new Tarefa(null);

        for (int i = 0; i < 9; i++) {
            tarefas.add(new Tarefa(null));
        }
        

        tarefa1.setStatus(Status.CONCLUIDA);
        tarefas.add(tarefa1);

        float contador = 0;
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getStatus() == Status.CONCLUIDA) {
                contador++;
            }
        }
        System.out.println((contador * 100) / tarefas.size()+"%");
    }
}
