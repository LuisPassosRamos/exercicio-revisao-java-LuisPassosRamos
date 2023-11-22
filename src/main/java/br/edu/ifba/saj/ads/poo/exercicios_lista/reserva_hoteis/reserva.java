package br.edu.ifba.saj.ads.poo.exercicios_lista.reserva_hoteis;

import java.time.LocalDate;

public class Reserva {
    private boolean reservado;
    private int noitesReserva;
    private float valorReserva;
    private LocalDate dataReserva;
    private LocalDate quandoReservado;

    public Reserva(int noitesReserva, float valorQuarto){
        this.reservado = true;
        this.noitesReserva = noitesReserva;
        this.quandoReservado = LocalDate.now();
        this.valorReserva = (valorQuarto*noitesReserva);
        this.dataReserva = this.quandoReservado.plusDays(noitesReserva);
    }
    public Reserva(){
        this.valorReserva = 0;
        this.reservado = false;
        this.noitesReserva = 0;
        this.dataReserva = null;
        this.quandoReservado = null;
    }

    public boolean isReservado() {
        return reservado;
    }

    public boolean setReservado(int noitesReserva, float valorQuarto) {
        if (!this.reservado){
            this.reservado = true;
            this.noitesReserva = noitesReserva;
            this.quandoReservado = LocalDate.now();
            this.valorReserva = (valorQuarto*noitesReserva);
            this.dataReserva = this.quandoReservado.plusDays(noitesReserva);
            return true;
        }

        return false;
    }

    public LocalDate getDataReserva() {
        return dataReserva;
    }

    public int getNoitesReserva() {
        return noitesReserva;
    }

    public boolean setNoitesReserva(int noitesReserva, float valorQuarto) {
        if (this.noitesReserva != noitesReserva){
            this.setValorReserva(valorQuarto);
            this.noitesReserva = noitesReserva;
            this.dataReserva = this.quandoReservado.plusDays(noitesReserva);
            return true;
        }
        return false;
    
    }

    public float getValorReserva() {
        return valorReserva;
    }

    private void setValorReserva(float valorQuarto) {
        this.valorReserva = (valorQuarto*noitesReserva);
    }   


    

}
