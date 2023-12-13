package br.edu.ifba.saj.ads.poo;

public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;
    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }
    public void roda(Conta c) {
        System.out.println(c.getSaldo());// aqui você imprime o saldo anterior
        c.atualiza(this.selic);//atualiza a conta
        System.out.println(c.getSaldo());// e depois imprime o saldo final
        this.saldoTotal += c.getSaldo();
    }

    public double getSaldoTotal() {
        return this.saldoTotal;
    }
    public double getSelic() {
        return this.selic;
    }
    
}