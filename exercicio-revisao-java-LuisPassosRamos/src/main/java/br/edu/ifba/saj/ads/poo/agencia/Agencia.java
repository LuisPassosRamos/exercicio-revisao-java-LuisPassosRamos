package br.edu.ifba.saj.ads.poo.agencia;

import java.util.ArrayList;

public class Agencia {

    private int numero;
    private ArrayList<Conta> contas;

    public Agencia(int numero) {
        this.numero = numero;
        contas = new ArrayList<>();
    }

    public Conta adicionarConta(String nome) {
        int numeroConta = this.numero;
        numeroConta += this.contas.size();

        Conta novaConta = new Conta(nome, numeroConta);
        this.contas.add(novaConta);
        return novaConta;
    }

    public Conta removerConta(Conta remConta) {
        this.contas.remove(remConta);
        return remConta;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public int getNumero() {
        return numero;
    }

}
