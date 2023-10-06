package br.edu.ifba.saj.ads.poo;

class Tv {
    double tamanhoTv;
    double voltagem;
    int volume;
    int canal;
    String marca;
    boolean ligado = false;

    Tv(String marca, double voltagem, double tamanhoTv) {
        this.canal = 1;
        this.volume = 5;
        this.marca = marca;
        this.voltagem = voltagem;
        this.tamanhoTv = tamanhoTv;
    }

    void ligar() {
        if (!this.ligado) {
            this.ligado = true;
            System.out.println("A televisão foi ligada.");
        } else
            System.out.println("A televisão já está ligada.");
        System.out.println("Consumo: " + this.voltagem * tamanhoTv);
    }

    void desligar() {
        if (this.ligado) {
            this.ligado = false;
            System.out.println("A televisão foi desligada.");
        } else
            System.out.println("A televisão já está desligada.");
    }

    void aumentarVol() {
        if (this.ligado) {
            if (this.volume < 10) {
                this.volume++;
            } else
                System.out.println("O volume ja esta no maximo.");
            System.out.println("Volume: " + this.volume);
        }
    }

    void diminuirVol() {
        if (this.ligado) {
            if (this.volume > 1) {
                this.volume--;
            } else
                System.out.println("O volume ja esta no minimo.");
            System.out.println("Volume: " + this.volume);
        }
    }

    void subirCanal() {
        if (this.ligado) {
            this.canal++;
            System.out.println("Canal atual:" + this.canal);
        }

    }

    void descerCanal() {
        if (this.ligado) {
            this.canal--;
            System.out.println("Canal atual:" + this.canal);
        }

    }
}