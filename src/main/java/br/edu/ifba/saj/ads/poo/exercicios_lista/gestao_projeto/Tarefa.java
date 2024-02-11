package br.edu.ifba.saj.ads.poo.exercicios_lista.gestao_projeto;

public class Tarefa {
    private Status status;
    private String responsavel;

    public Tarefa(String responsavel) {
        this.status = Status.EM_ANDAMENTO;
        this.responsavel = responsavel;
    }

    public Tarefa(){
        this.status = Status.EM_ANDAMENTO;
        this.responsavel = null;
    }

    public Status getStatus() {
        return status;
    }

    public String getResponsavel() {
        return responsavel;
    }



    public void setStatus(Status status) {
        this.status = status;
    }

    public void setResponsavel(String responsavel) {
       if (this.responsavel != responsavel) {
         this.responsavel = responsavel;
       }
    }
    
}
