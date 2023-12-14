package br.edu.ifba.saj.ads.poo.converter_extenso;

public class ConverterExtenso1Digito extends ConverterExtenso {

    private final String[] porExtenso = { "Zero", "Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito",
            "Nove", "Dez" };

    public ConverterExtenso1Digito(int numero) {
        super(numero);
    }

    @Override
    public String toString() {
        return porExtenso[this.numero % 10];
    }
}
