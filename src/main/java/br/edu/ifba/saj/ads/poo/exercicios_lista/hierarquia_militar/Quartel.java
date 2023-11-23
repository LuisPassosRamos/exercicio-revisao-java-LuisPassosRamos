package br.edu.ifba.saj.ads.poo.exercicios_lista.hierarquia_militar;

public class Quartel {
    public static void main(String[] args) {
        Soldado mySoldado = new Soldado("Soldado principal", 15);
        Cabo myCabo = new Cabo("Cabo principal", 15);
        Sargento mySargento = new Sargento("Sargento principal", 15);
        Tenente myTenente = new Tenente("Tenente principal", 15);
        Capitao myCapitao = new Capitao("Capitao principal", 15);

        //For de subordinados em cabo;
        for (int i = 0; i < 5; i++) {
            myCabo.addSubordinado(new Soldado("Soldado 0"+(i+1), i+1));
            myCabo.incrementarTempoServico();
        }
        //For de subordinados em Sargento;
        for (int i = 0; i < 5; i++) {
            mySargento.addSubordinado(new Cabo("Cabo 0"+(i+1), i+1));
            mySargento.incrementarTempoServico();
        }
        //For de subordinados em cabo;
        for (int i = 0; i < 5; i++) {
            myTenente.addSubordinado(new Sargento("Sargento 0"+(i+1), i+1));
            myTenente.incrementarTempoServico();
        }
        //For de subordinados em cabo;
        for (int i = 0; i < 5; i++) {
            myCapitao.addSubordinado(new Tenente("Tenente 0"+(i+1), i+1));
            myCapitao.incrementarTempoServico();
            myCapitao.incrementarTempoServico();
        }

        mySoldado.incrementarTempoServico();


        for (int i = 0; i < 2; i++) {
            myCabo.incrementarTempoServico();
        }
        for (int i = 0; i < 3; i++) {
            mySargento.incrementarTempoServico();
        }
        for (int i = 0; i < 4; i++) {
            myTenente.incrementarTempoServico();
        }

        mySoldado.setImediatoSoldado(myCabo);
        myCabo.setImediatoCabo(mySargento);
        mySargento.setImediatoSargento(myTenente);
        myTenente.setImediatoTenente(myCapitao);


        System.out.println(myCapitao+"\n");

        for (Soldado Soldado :
                myCabo.getSubordinadosCabo()) {
            System.out.println("["+Soldado.getNomeSoldado()+","+Soldado.getIdentificacaoSoldado()+","+Soldado.getTempoServico()+"]");
        }
        for (Cabo cabo :
                mySargento.getSubordinadosSargento()) {
            System.out.println("["+cabo.getNomeCabo()+","+cabo.getIdentificacaoCabo()+","+cabo.getTempoServico()+"]");
        }
    }
}
