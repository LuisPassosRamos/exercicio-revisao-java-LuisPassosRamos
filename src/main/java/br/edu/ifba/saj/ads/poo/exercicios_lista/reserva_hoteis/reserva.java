package br.edu.ifba.saj.ads.poo.exercicios_lista.reserva_hoteis;

import java.time.LocalDate;

public class Reserva {
    private boolean reservado;
    private int noitesReserva;
    private float valorReserva;
    private LocalDate dataReserva;
    private LocalDate quandoReservado;

    public Reserva(int noitesReserva, float valorQuarto) {
        this.reservado = true;
        this.noitesReserva = noitesReserva;
        this.quandoReservado = LocalDate.now();
        this.valorReserva = (valorQuarto * noitesReserva);
        this.dataReserva = this.quandoReservado.plusDays(noitesReserva);
    }

    public Reserva() {
        this.valorReserva = 0;
        this.reservado = false;
        this.noitesReserva = 0;
        this.dataReserva = null;
        this.quandoReservado = null;
    }

    public boolean setReservado(int noitesReserva, float valorQuarto) {
        if (!this.reservado && noitesReserva > 0 && valorQuarto >= 0) {
            this.reservado = true;
            this.noitesReserva = noitesReserva;
            this.quandoReservado = LocalDate.now();
            this.valorReserva = (valorQuarto * noitesReserva);
            this.dataReserva = this.quandoReservado.plusDays(noitesReserva);
            return true;
        }
        return false;
    }

    public boolean addNoitesReserva(int noitesReserva, float valorQuarto) {
        if (noitesReserva > 0) {
            this.setValorReserva(valorQuarto);
            this.noitesReserva += noitesReserva;
            this.dataReserva = this.quandoReservado.plusDays(this.noitesReserva);
            return true;
        }
        return false;
    }

    public boolean decNoitesReserva(int noitesReserva, float valorQuarto){
        if (noitesReserva > 0) {
            this.setValorReserva(valorQuarto);
            this.noitesReserva -= noitesReserva;
            this.dataReserva = this.quandoReservado.plusDays(this.noitesReserva);
            return true;
        }
        return false;
    }

    private boolean setValorReserva(float valorQuarto) {
        if (this.reservado && this.noitesReserva > 0 && valorQuarto >= 0) {
            this.valorReserva = (valorQuarto * noitesReserva);
            return true;
        }
        return false;
    }

    public boolean isReservado() {
        return this.reservado;
    }

    public LocalDate getDataReserva() {
        return this.dataReserva;
    }

    public int getNoitesReserva() {
        return this.noitesReserva;
    }

    public float getValorReserva() {
        return this.valorReserva;
    }

}
