/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package br.edu.ifba.saj.ads.poo;

public class App {
    public static void main(String[] args) {
        
        Filme myFilme = new Filme("Meu Filme", "Minha Categoria", 120);
        Dvd myDvd = new Dvd();
        myDvd.ligar();
        myDvd.inserirFilme(myFilme);
        myDvd.darPlay();
        
    }
}
