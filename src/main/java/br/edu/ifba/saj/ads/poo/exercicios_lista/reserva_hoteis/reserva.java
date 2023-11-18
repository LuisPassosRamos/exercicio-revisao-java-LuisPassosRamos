package br.edu.ifba.saj.ads.poo.exercicios_lista.reserva_hoteis;

import java.time.LocalDate;

public class Reserva {
    private LocalDate dataReserva;
    private float valorReserva;
    private boolean reservado;
    private int noitesReserva;
    private LocalDate quandoReservado

    public Reserva(LocalDate dataReserva, int noitesReserva, float valorQuarto){
        this.reservado = true;
        this.dataReserva = dataReserva;
        this.noitesReserva = noitesReserva;
        this.quandoReservado = LocalDate.now();
        this.valorReserva = valorQuarto*noitesReserva;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public LocalDate getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(LocalDate dataReserva) {
        this.dataReserva = dataReserva;
    }

    public int getNoitesReserva() {
        return noitesReserva;
    }

    public void setNoitesReserva(int noitesReserva) {
        this.noitesReserva = noitesReserva;
    }

    public float getValorReserva() {
        return valorReserva;
    }

    public void setValorReserva(float valorReserva) {
        this.valorReserva = valorReserva;
    }   
}
