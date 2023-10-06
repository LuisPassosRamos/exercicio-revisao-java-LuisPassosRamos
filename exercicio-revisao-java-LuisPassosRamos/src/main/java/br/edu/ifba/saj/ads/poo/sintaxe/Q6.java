package br.edu.ifba.saj.ads.poo.sintaxe;

public class Q6 {
    public static void main(String[] args) {
        int limite = 100;
        int numeroAnterior = 0;
        int numeroAtual = 1;

        System.out.println("Os primeiros valores de Fibonacci até passar de 100 são:");

        while (numeroAtual <= limite) {
            
            System.out.print(numeroAnterior + " ");
            int proximoNumero = numeroAnterior + numeroAtual;
            numeroAnterior = numeroAtual;
            numeroAtual = proximoNumero;
        }
    }
}
