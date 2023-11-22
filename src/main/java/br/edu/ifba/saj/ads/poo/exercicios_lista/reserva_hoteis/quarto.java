package br.edu.ifba.saj.ads.poo.exercicios_lista.reserva_hoteis;

public class Quarto {
    private Reserva reservaQuarto;
    private String categoriaQuarto;
    private static int numeroQuarto;
    
    

    public Quarto(String categoria){
        Quarto.numeroQuarto++;
        this.categoriaQuarto = categoria;
        this.reservaQuarto = new Reserva();
    }



    public String getCategoriaQuarto() {
        return categoriaQuarto;
    }



    public void setCategoriaQuarto(String categoriaQuarto) {
        this.categoriaQuarto = categoriaQuarto;
    }



    public Reserva getReservaQuarto() {
        return reservaQuarto;
    }



    public void setReservaQuarto(Reserva reservaQuarto) {
        this.reservaQuarto = reservaQuarto;
    }

    public static int getNumeroQuarto() {
        return numeroQuarto;
    }
}
