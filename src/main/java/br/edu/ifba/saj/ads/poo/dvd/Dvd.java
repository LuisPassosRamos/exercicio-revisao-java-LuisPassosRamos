package br.edu.ifba.saj.ads.poo.dvd;

class Dvd {
    boolean play;
    boolean ligado;
    int volume;
    Filme filme;

    Dvd() {
        this.play = false;
        this.ligado = false;
        this.volume = 2;
    }

    void ligar() {
        if (!this.ligado) {
            this.ligado = true;
            System.out.println("O aparelho foi ligado.");
        } else if (this.ligado) {
            System.out.println("O aparelho já está ligado.");
        }
    }

    void desligar() {
        if (this.ligado) {
            this.ligado = false;
            System.out.println("O aparelho foi desligado.");
        } else if (!this.ligado) {
            System.out.println("O aparelho já está desligado.");
        }
    }

    void aumentarVol() {
        if (this.ligado) {
            if (this.volume < 5) {
                this.volume++;
                System.out.println("Volume aumentado.");
            } else
                System.out.println("O volume já está no máximo.");
            System.out.println("Nível atual do volume: " + this.volume);
        }
    }

    void diminuirVol() {
        if (this.ligado) {
            if (this.volume > 1) {
                this.volume--;
                System.out.println("Volume diminuído.");
            } else
                System.out.println("O volume já está no mínimo.");
            System.out.println("Nível atual do volume: " + this.volume);
        }
    }

    void inserirFilme(Filme filme) {
        if (this.ligado) {

            if (this.filme == null) {
                this.filme = filme;
                System.out.println("O filme " + this.filme.nome + " foi inserido.");
                System.out.println("Duração: " + this.filme.duracao + " minutos.");
            } else
                System.out.println("Já há um filme inserido.");

        }
    }

    void removerFilme() {
        if (this.ligado) {
            if (this.filme != null) {
                this.filme = null;
                System.out.println("O filme foi removido.");
            } else
                System.out.println("Não há nenhum filme inserido no momento.");
        }
    }

    void darPlay() {
        if (this.ligado) {
            if (!this.play && this.filme != null) {
                this.play = true;
                System.out.println("Filme: " + this.filme.nome + "\nDuração: " + this.filme.duracao + "\nPlay!");
            } else if (this.filme == null)
                System.out.println("Não há nenhum filme inserido para dar play.");
            else if (this.play)
                System.out.println("O filme já está em andamento.");
        }
    }

    void darStop() {
        if (this.ligado) {
            if (this.play && this.filme != null) {
                this.play = false;
                System.out.println("Stop.");
            } else if (this.filme == null)
                System.out.println("Não há nenhum filme inserido para dar play.");
            else if (!this.play)
                System.out.println("O filme já está pausado.");
        }
    }
}