/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package br.edu.ifba.saj.ads.poo.tv;

public class App {

      public static void main(String[] args) {
        Tv myTv = new Tv("Panasonic", 220, 42);
        myTv.desligar();
        myTv.ligar();
        myTv.ligar();
        myTv.subirCanal();
        myTv.subirCanal();
        myTv.descerCanal();
        myTv.descerCanal();
        myTv.aumentarVol();
        myTv.aumentarVol();
        myTv.aumentarVol();
        myTv.aumentarVol();
        myTv.aumentarVol();
        myTv.aumentarVol();
        myTv.diminuirVol();
        myTv.diminuirVol();
    }
}
