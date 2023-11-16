package br.edu.ifba.saj.ads.poo.exercicios_lista.loja_roupas;

public class Loja {
    public static void main(String[] args) {
        Departamento departamentoMasc = new Departamento("Masculino");

        for (int i = 0; i < 5; i++) {
            departamentoMasc.criarRoupa("camisa", "vermelho", "M", i+1);
        }

        System.out.println(departamentoMasc.getRoupas());
        Carrinho carrinho1 = new Carrinho();
        
        
        
    }
}
