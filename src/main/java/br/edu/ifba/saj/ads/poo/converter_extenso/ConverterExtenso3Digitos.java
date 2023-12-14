package br.edu.ifba.saj.ads.poo.converter_extenso;

public class ConverterExtenso3Digitos extends ConverterExtenso2Digitos {
    private final String[] porExtensoCentena = { "", "Cento", "Duzentos", "Trezentos", "Quatrocentos", "Quinhentos",
            "Seiscentos", "Setecentos", "Oitocentos", "Novecentos" };

    public ConverterExtenso3Digitos(int numero) {
        super(numero);
    }

    @Override
    public String toString() {
        if (this.numero == 100) {
            return "cem";
        }
        if (this.numero % 100 == 0) {
            return porExtensoCentena[this.numero / 100];
        }
        return porExtensoCentena[this.numero / 100] + " e " + super.toString();
    }
}
