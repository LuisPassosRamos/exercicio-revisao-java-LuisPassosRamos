package br.edu.ifba.saj.ads.poo.agencia;

import java.util.ArrayList;

public class Agencia {

    private int numero;
    private ArrayList<Conta> contas;

    Agencia(int numero) {
        this.numero = numero;
    }

    public Conta adicionarConta(String nome) {
        int numeroConta = this.numero;
        numeroConta += contas.size();

        Conta novaConta = new Conta(nome, numeroConta);
        contas.add(novaConta);
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
