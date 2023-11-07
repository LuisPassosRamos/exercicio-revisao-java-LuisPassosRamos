package br.edu.ifba.saj.ads.poo.exercicios_lista.loja_roupas;

public class loja {
    public static void main(String[] args) {
        departamento departamentoMasc = new departamento("Masculino");
        departamento departamentoFem = new departamento("Feminino");
        departamento departamentoInf = new departamento("Infantil");

        for (int i = 1; i < 6; i++) {
            departamentoMasc.addRoupa(new roupa("Camisa","masculino", "Branco", "M", (i * 2)));
        }
        for (int i = 1; i < 6; i++){
            departamentoFem.addRoupa(new roupa("Camisa","feminino", "Preto", "P", (i * 2)));
        }
        for (int i = 1; i < 6; i++) {
            departamentoInf.addRoupa(new roupa("Camisa","infantil", "Amarelo", "PP", (i * 2)));
        }

        for (int i = 1; i < 6; i++) {
            departamentoMasc.addRoupa(new roupa("Camisa","feminino", "Branco", "M", (i * 2)));
        }
        for (int i = 1; i < 6; i++){
            departamentoFem.addRoupa(new roupa("Camisa","infantil", "Preto", "P", (i * 2)));
        }
        for (int i = 1; i < 6; i++) {
            departamentoInf.addRoupa(new roupa("Camisa","masculino", "Amarelo", "PP", (i * 2)));
        }


        for (roupa roupa : departamentoMasc.getRoupas()){
            System.out.println(roupa);
        }

        carrinho carrinho1 = new carrinho();

        for (int i = 1; i < 6; i++) {
            carrinho1.addRoupa(new roupa("Camisa","feminino", "Branco", "M", (i * 2)));
        }

        System.out.println(carrinho1);
        
    }
}
