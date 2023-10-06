package br.edu.ifba.saj.ads.poo;

import java.util.Scanner;

class Q7 {
    public static void main(String[] args) {
        int x;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        x = teclado.nextInt();
        while (x  > 1) {
            if (x % 2 == 0) {
                x = x / 2;
            }else x = 3*x+1;
            if (x > 1) System.out.print(x+" -> ");
            else System.out.print(x);
        }
    }
}