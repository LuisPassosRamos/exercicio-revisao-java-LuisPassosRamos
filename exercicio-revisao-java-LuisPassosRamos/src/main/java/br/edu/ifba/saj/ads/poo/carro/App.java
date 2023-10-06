/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package br.edu.ifba.saj.ads.poo;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    

    public static void main(String[] args) {
        Carro myCar = new Carro();
        myCar.modelo = "Palio";

        myCar.acelerar();
        myCar.desligar();
        myCar.ligar();
        myCar.desligar();
        myCar.ligar();
        myCar.ligar();
        myCar.marchaBaixo();
        myCar.marchaBaixo();
        myCar.marchaBaixo();
        myCar.marchaBaixo();
        myCar.marchaCima();
        myCar.marchaCima();
        myCar.marchaCima();
        myCar.marchaCima();
        myCar.marchaCima();
        myCar.marchaCima();
        myCar.marchaCima();
        myCar.acelerar();
        myCar.acelerar();
        myCar.acelerar();
        myCar.acelerar();
    }
}
