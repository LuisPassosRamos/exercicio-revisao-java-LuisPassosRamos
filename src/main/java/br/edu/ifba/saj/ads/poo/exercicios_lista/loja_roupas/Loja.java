package br.edu.ifba.saj.ads.poo.exercicios_lista.loja_roupas;

public class Loja {
    public static void main(String[] args) {
        Departamento departamentoMasc = new Departamento("Masculino");
        Departamento departamentoFem = new Departamento("Feminino");
        Departamento departamentoInf = new Departamento("Infantil");

        for (Roupa roupa : departamentoMasc.getRoupas()){
            System.out.println(roupa);
        }

        Carrinho carrinho1 = new Carrinho();

        System.out.println(carrinho1);
        
    }
}
