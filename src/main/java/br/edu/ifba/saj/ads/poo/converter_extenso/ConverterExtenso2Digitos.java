package br.edu.ifba.saj.ads.poo.converter_extenso;

public class ConverterExtenso2Digitos extends ConverterExtenso1Digito {

    public final String[] porExtensoVinte = { "", "Onze", "Doze", "Treze", "Catorze", "Quinze", "Dezesseis", "Dezessete",
            "Dezoito", "Dezenove" };

    public final String[] porExtensoDezena = { "", "Dez", "Vinte", "Trinta", "Quarenta", "Ciquenta", "Sessenta", "Setenta",
            "Oitenta", "Noventa" };

    public ConverterExtenso2Digitos(int numero) {
        super(numero);
    }

    @Override
    public String toString() {
        if (this.numero > 10 && this.numero < 20) {
            return porExtensoVinte[this.numero];
        }
        if (this.numero % 10 == 0) {
            return porExtensoDezena[this.numero / 10];
        }
        return porExtensoDezena[this.numero / 10] + " e " + super.toString();

    }
}
