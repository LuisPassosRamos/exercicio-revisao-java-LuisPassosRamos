package br.edu.ifba.saj.ads.poo;

public abstract class ConverterExtenso {
    protected int numero;

    public ConverterExtenso(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}