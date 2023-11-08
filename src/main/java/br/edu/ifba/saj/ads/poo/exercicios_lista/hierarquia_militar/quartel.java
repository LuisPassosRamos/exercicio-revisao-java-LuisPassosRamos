package br.edu.ifba.saj.ads.poo.exercicios_lista.hierarquia_militar;

public class quartel {
    public static void main(String[] args) {
        soldado mySoldado = new soldado("Soldado principal", 15);
        cabo myCabo = new cabo("Cabo principal", 15);
        sargento mySargento = new sargento("Sargento principal", 15);
        tenente myTenente = new tenente("Tenente principal", 15);
        capitao myCapitao = new capitao("Capitao principal", 15);

        //For de subordinados em cabo;
        for (int i = 0; i < 5; i++) {
            myCabo.addSubordinado(new soldado("Soldado 0"+(i+1), i+1));
            myCabo.incrementarTempoServico();
        }
        //For de subordinados em sargento;
        for (int i = 0; i < 5; i++) {
            mySargento.addSubordinado(new cabo("Cabo 0"+(i+1), i+1));
            mySargento.incrementarTempoServico();
        }
        //For de subordinados em cabo;
        for (int i = 0; i < 5; i++) {
            myTenente.addSubordinado(new sargento("Sargento 0"+(i+1), i+1));
            myTenente.incrementarTempoServico();
        }
        //For de subordinados em cabo;
        for (int i = 0; i < 5; i++) {
            myCapitao.addSubordinado(new tenente("Tenente 0"+(i+1), i+1));
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

        for (soldado soldado :
                myCabo.getSubordinadosCabo()) {
            System.out.println("["+soldado.getNomeSoldado()+","+soldado.getIdentificacaoSoldado()+","+soldado.getTempoServico()+"]");
        }
        for (cabo cabo :
                mySargento.getSubordinadosSargento()) {
            System.out.println("["+cabo.getNomeCabo()+","+cabo.getIdentificacaoCabo()+","+cabo.getTempoServico()+"]");
        }
    }
}
