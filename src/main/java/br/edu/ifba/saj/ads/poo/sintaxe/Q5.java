package br.edu.ifba.saj.ads.poo.sintaxe;

public class Q5 {
    public static void main(String[] args) {
        long fatorial = 1;
        for (int n = 1; n <= 40; n++) {
            if (n <= 10 || n%5 == 0){
            fatorial = fatorial * n;
            System.out.println(n + "! = " + fatorial);
        }
        }
    }
}
