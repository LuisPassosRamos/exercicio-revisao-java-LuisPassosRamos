package br.edu.ifba.saj.ads.poo;

//Imprima todos os múltiplos de 3, entre 1 e 100.
class Q3 {
    public static void main(String[] args) {
        //Estrutura de repetição controlada (for());
        //Auto incremento com o operador "++"
        for (int i = 1; i < 100; i++){
            //Verificando e imprimindo multiplos de 3;
            if ((i % 3) == 0){
                System.out.println(i);
            }
        }
    }
}