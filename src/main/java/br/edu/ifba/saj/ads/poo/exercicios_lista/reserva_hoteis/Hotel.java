package br.edu.ifba.saj.ads.poo.exercicios_lista.reserva_hoteis;

public class Hotel {
    public static void main(String[] args) {
        Quarto q1 = new Quarto(Categoria.LUXO);
        q1.setReservado(10);
        System.out.println(q1);
        
    }
}
