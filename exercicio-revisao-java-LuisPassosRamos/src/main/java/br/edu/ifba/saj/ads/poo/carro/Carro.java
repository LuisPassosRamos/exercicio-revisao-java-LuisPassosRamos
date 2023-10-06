package br.edu.ifba.saj.ads.poo;

class Carro {
    String modelo;
    int velocidade;
    int aceleração = 5;
    int marcha = 0;
    boolean ligado = false;

  

    void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O carro foi ligado.");
        } else if (ligado) {
            System.out.println("O carro já está ligado.");
        }

    }

    void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O carro foi desligado.");
        } else if (!ligado) {
            System.out.println("O carro já está desligado.");
        }
    }

    void acelerar() {
        if (ligado) {
            velocidade += aceleração;
        } else if (!ligado) {
            System.out.println("Tente ligar o carro antes de acelerar.");
        }
    }

    void virarDireita() {
        System.out.println("O carro virou à direita.");
    }

    void virarEsquerda() {
        System.out.println("O carro virou à esquerda.");
    }

    void marchaCima() {
        if (marcha < 6) {
            marcha++;
            switch (marcha) {
                case 0:
                    System.out.println("Você está no ponto morto.");
                    break;

                case -1:
                    System.out.println("Você está na marcha ré.");
                    break;
                default:
                    System.out.println("Você está na " + marcha+"ª marcha.");
                    break;
            }
        }
    }

    void marchaBaixo() {
        if (marcha >= -1) {
            marcha--;
            switch (marcha) {
                case 0:
                    System.out.println("Você está no ponto morto.");
                    break;

                case -1:
                    System.out.println("Você está na marcha ré.");
                    break;
                default:
                    System.out.println("Você está na " + marcha+"ª marcha.");
                    break;
            }

        }
    }
}