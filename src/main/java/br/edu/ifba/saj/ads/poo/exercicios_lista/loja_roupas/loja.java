package br.edu.ifba.saj.ads.poo.exercicios_lista.loja_roupas;

public class loja {
    public static void main(String[] args) {
        departamento departamentoMasc = new departamento("Masculino");
        departamento departamentoFem = new departamento("Feminino");
        departamento departamentoInf = new departamento("Infantil");

        for (int i = 1; i < 6; i++) {
            departamentoMasc.addRoupa(new roupa("masculino", "Branco", "M", (i * 2)));
        }
        for (int i = 1; i < 6; i++){
            departamentoFem.addRoupa(new roupa("feminino", "Preto", "P", (i * 2)));
        }
        for (int i = 1; i < 6; i++) {
            departamentoInf.addRoupa(new roupa("infantil", "Amarelo", "PP", (i * 2)));
        }

        for (int i = 1; i < 6; i++) {
            departamentoMasc.addRoupa(new roupa("feminino", "Branco", "M", (i * 2)));
        }
        for (int i = 1; i < 6; i++){
            departamentoFem.addRoupa(new roupa("infantil", "Preto", "P", (i * 2)));
        }
        for (int i = 1; i < 6; i++) {
            departamentoInf.addRoupa(new roupa("masculino", "Amarelo", "PP", (i * 2)));
        }

        System.out.println(departamentoMasc);
        System.out.println(departamentoFem);
        System.out.println(departamentoInf);

        System.out.println(departamentoMasc.getRoupasLenght());
        System.out.println(departamentoFem.getRoupasLenght());
        System.out.println(departamentoInf.getRoupasLenght());

    }
}
