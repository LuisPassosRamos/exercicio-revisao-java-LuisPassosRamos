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

    private void setValorReserva(float valorQuarto) {
        if (this.reservado && this.noitesReserva > 0 && valorQuarto >= 0) {
            this.valorReserva = (valorQuarto * noitesReserva);
        }
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

    @Override
    public String toString() {
        return "Reserva [reservado=" + reservado + ", noitesReserva=" + noitesReserva + ", valorReserva=" + valorReserva
                + ", dataReserva=" + dataReserva + ", quandoReservado=" + quandoReservado + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (reservado ? 1231 : 1237);
        result = prime * result + noitesReserva;
        result = prime * result + Float.floatToIntBits(valorReserva);
        result = prime * result + ((dataReserva == null) ? 0 : dataReserva.hashCode());
        result = prime * result + ((quandoReservado == null) ? 0 : quandoReservado.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Reserva other = (Reserva) obj;
        if (reservado != other.reservado)
            return false;
        if (noitesReserva != other.noitesReserva)
            return false;
        if (Float.floatToIntBits(valorReserva) != Float.floatToIntBits(other.valorReserva))
            return false;
        if (dataReserva == null) {
            if (other.dataReserva != null)
                return false;
        } else if (!dataReserva.equals(other.dataReserva))
            return false;
        if (quandoReservado == null) {
            if (other.quandoReservado != null)
                return false;
        } else if (!quandoReservado.equals(other.quandoReservado))
            return false;
        return true;
    }


}
