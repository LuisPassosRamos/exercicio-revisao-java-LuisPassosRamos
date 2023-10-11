package br.edu.ifba.saj.ads.poo.agencia;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {
            Agencia A1 = new Agencia(10);
            

            for (int i = 0; i < 5; i++) {
                System.out.println("Digite o "+(i+1)+" nome.");
                String nome = teclado.nextLine();
                A1.adicionarConta(nome);
            }

            System.out.println(A1.getContas());
        }

    }
}
