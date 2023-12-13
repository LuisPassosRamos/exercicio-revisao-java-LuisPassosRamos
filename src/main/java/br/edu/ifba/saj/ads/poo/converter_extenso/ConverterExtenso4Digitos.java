package br.edu.ifba.saj.ads.poo;

public class ConverterExtenso4Digitos extends ConverterExtenso3Digitos {

    private String[] porExtensoMilhar = { "", "Mil", "Dois mil", "Três mil", "Quatro mil", "Cinco mil", "Seis mil", };

    public ConverterExtenso4Digitos(int numero) {
        super(numero);
    }

    @Override
    public String toString() {
        if (this.numero % 1000 == 0) {
            return porExtensoMilhar[this.numero / 1000];
        }

        return porExtensoMilhar[this.numero / 1000] + super.toString();

    }
}
