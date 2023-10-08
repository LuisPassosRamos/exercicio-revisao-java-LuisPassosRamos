package br.edu.ifba.saj.ads.poo.agencia;

class Conta {
    private String nome;
    private int numero;

    Conta(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
    }

    Conta(int numero){
        this.numero = numero;

    }

    @Override
    public String toString() {
        return "conta [nome=" + nome + ", numero=" + numero + "]\n";
    }
    
}
