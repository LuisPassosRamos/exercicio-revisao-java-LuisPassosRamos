package br.edu.ifba.saj.ads.poo.agencia;

import java.util.ArrayList;

public class Agencia {

    private int numero;
    private ArrayList<Conta> contas;

    Agencia(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public Conta adicionarConta(){
        int numeroConta = this.numero*100;
        numeroConta += contas.size();

        Conta novaConta = new Conta(numeroConta);
       
        return novaConta;
    }

}
