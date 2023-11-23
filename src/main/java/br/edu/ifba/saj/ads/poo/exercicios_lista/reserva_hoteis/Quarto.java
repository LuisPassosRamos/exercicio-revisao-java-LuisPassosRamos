package br.edu.ifba.saj.ads.poo.exercicios_lista.reserva_hoteis;

public class Quarto extends Reserva{
    private Reserva reservaQuarto;
    private Categoria categoriaQuarto;
    private static int numeroQuarto;
    private float valorNoite;
    
    public Quarto(Categoria categoria){
        Quarto.numeroQuarto++;
        this.categoriaQuarto = categoria;

        switch (this.categoriaQuarto) {
            case ECONOMICO:
                this.valorNoite = 60;
                break;

            case COMUM:
                this.valorNoite = 80;
                break;

            case LUXO:
                this.valorNoite = 120;
                break;
        }
    }

    public float getValorNoite() {
        return valorNoite;
    }

    public Categoria getCategoriaQuarto() {
        return this.categoriaQuarto;
    }

    public static int getNumeroQuarto() {
        return numeroQuarto;
    }
}
