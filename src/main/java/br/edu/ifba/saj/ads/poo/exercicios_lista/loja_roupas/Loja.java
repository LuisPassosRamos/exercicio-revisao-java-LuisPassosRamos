package br.edu.ifba.saj.ads.poo.exercicios_lista.loja_roupas;

public class Loja {
    public static void main(String[] args) {
        Departamento departamentoMasc = new Departamento("Masculino");
        ArrayList<Roupa> roupas = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            departamentoMasc.addRoupa(new Roupa("camisa", departamentoMasc, "vermelho", Tamanho.M, i+1));
        }
        Carrinho carrinho1 = new Carrinho();
        carrinho1.addRoupa(new Roupa ("camisa",departamentoMasc, "vermelho", Tamanho.M, 1));
        System.out.println(carrinho1);
    }
}
