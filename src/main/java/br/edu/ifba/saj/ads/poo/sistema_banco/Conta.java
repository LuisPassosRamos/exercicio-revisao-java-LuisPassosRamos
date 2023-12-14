package br.edu.ifba.saj.ads.poo.sistema_banco;


public class Conta {
    private double saldo;


    public Conta(){
        this.saldo = 0;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public void atualiza(double taxa) {
        this.saldo -= (this.saldo*taxa);
    }

}
