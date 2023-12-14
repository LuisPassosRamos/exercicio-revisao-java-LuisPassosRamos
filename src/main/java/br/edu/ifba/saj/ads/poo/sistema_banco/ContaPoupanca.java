package br.edu.ifba.saj.ads.poo.sistema_banco;

public class ContaPoupanca extends Conta{

    @Override
    public void atualiza(double taxa) {
        super.atualiza(taxa*3);
    }
}
