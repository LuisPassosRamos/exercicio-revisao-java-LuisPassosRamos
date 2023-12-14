package br.edu.ifba.saj.ads.poo.exercicios_lista.reserva_hoteis;

import java.time.LocalDate;

public class Quarto {
    private float valorNoite;
    private int numeroQuarto;
    private Reserva reservaQuarto;
    private Categoria categoriaQuarto;
    private static int quantidadeQuarto;

    public Quarto(Categoria categoria) {

        Quarto.quantidadeQuarto++;
        this.categoriaQuarto = categoria;
        this.reservaQuarto = new Reserva();
        this.numeroQuarto = Quarto.quantidadeQuarto;
        
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

    public boolean addNoitesReserva(int noitesReserva) {
        return this.reservaQuarto.addNoitesReserva(noitesReserva, this.valorNoite);
    }

    public boolean decNoitesReserva(int noitesReserva) {
        return this.reservaQuarto.decNoitesReserva(noitesReserva, this.valorNoite);
    }

    public float getValorNoite() {
        return valorNoite;
    }

    public Categoria getCategoriaQuarto() {
        return this.categoriaQuarto;
    }

    public int getNumeroQuarto() {
        return this.numeroQuarto;
    }

    public static int getQuantidadeQuarto() {
        return Quarto.quantidadeQuarto;
    }

    public boolean isReservado() {
        return this.reservaQuarto.isReservado();
    }

    public LocalDate getDataReserva() {
        return this.reservaQuarto.getDataReserva();
    }

    public int getNoitesReserva() {
        return this.reservaQuarto.getNoitesReserva();
    }

    public float getValorReserva() {
        return this.reservaQuarto.getValorReserva();
    }

    @Override
    public String toString() {
        return "Quarto [valorNoite=" + valorNoite + ", numeroQuarto=" + numeroQuarto + ", categoriaQuarto="
                + categoriaQuarto + ", reservaQuarto=" + reservaQuarto + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Float.floatToIntBits(valorNoite);
        result = prime * result + numeroQuarto;
        result = prime * result + ((reservaQuarto == null) ? 0 : reservaQuarto.hashCode());
        result = prime * result + ((categoriaQuarto == null) ? 0 : categoriaQuarto.hashCode());
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
        Quarto other = (Quarto) obj;
        if (Float.floatToIntBits(valorNoite) != Float.floatToIntBits(other.valorNoite))
            return false;
        if (numeroQuarto != other.numeroQuarto)
            return false;
        if (reservaQuarto == null) {
            if (other.reservaQuarto != null)
                return false;
        } else if (!reservaQuarto.equals(other.reservaQuarto))
            return false;
        if (categoriaQuarto != other.categoriaQuarto)
            return false;
        return true;
    }

}
