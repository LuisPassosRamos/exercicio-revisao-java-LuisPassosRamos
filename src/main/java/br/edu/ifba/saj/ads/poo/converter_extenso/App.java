/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package br.edu.ifba.saj.ads.poo;

public class App {
    public static void main(String[] args) {
        ConverterExtenso ce = null;
        // ce = new ConverterExtenso4Digitos(9999);
        // System.out.println(ce);
        // // -> Nove Mil Novecentos e Noventa e Nove

        ce = new ConverterExtenso3Digitos(999);
        System.out.println(ce);
        // -> Novecentos e Noventa e Nove
        ce = new ConverterExtenso2Digitos(99);
        System.out.println(ce);
        // -> Noventa e Nove
        ce = new ConverterExtenso1Digito(9);
        System.out.println(ce);
        // -> Nove
    
    }
}
