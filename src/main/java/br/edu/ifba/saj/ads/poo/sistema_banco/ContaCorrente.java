package br.edu.ifba.saj.ads.poo.sistema_banco;

public class ContaCorrente extends Conta{

    @Override
    public void atualiza(double taxa) {
        super.atualiza(taxa*2);
    }

    @Override
    public void deposita(double valor) {
        super.deposita(valor-0.10);
    }

}
