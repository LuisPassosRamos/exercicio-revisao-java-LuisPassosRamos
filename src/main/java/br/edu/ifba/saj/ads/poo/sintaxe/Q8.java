package br.edu.ifba.saj.ads.poo.sintaxe;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        int n;
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Digite um número inteiro:");
            n = teclado.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println(); // Mova para a próxima linha após cada linha ser impressa
        }
    }
}
