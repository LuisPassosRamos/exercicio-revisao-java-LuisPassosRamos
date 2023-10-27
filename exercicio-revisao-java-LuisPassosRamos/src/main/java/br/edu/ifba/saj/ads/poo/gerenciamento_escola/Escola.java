/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

///Exercício: Gerenciamento de Escola

/*
1. Utilizando os conhecimentos de O.O. construa um programa utilizando as informações abaixo. 

Desenvolva um programa para gerenciar informações de uma escola. 
Cada escola contém várias turmas, cada turma tem vários alunos e professores. 
Os alunos podem pertencer a mais de uma turma. Os professores ministram aulas em uma ou mais turmas. 
Os dados devem ser organizados para permitir consultas sobre quais turmas um professor leciona e quais alunos estão matriculados em uma turma específica.*/

package br.edu.ifba.saj.ads.poo.gerenciamento_escola;

public class Escola {
    public static void main(String[] args) {

        Turma turma1 = new Turma(1);
        Turma turma2 = new Turma(2);
        Turma turma3 = new Turma(3);

        Professor professor1 = new Professor ("Leandro", "POO");
        Professor professor2 = new Professor ("Ester", "LAB. REDES");
        Professor professor3 = new Professor ("Flavio", "ANALISE E PROJETO DE SISTEMAS");
        Professor professor4 = new Professor ("", "POO");
        Professor professor5 = new Professor ("Guilherme", "POO");
    
        Aluno aluno1 = new Aluno("Luis", 1, turma1);

        System.out.println(turma1.getAlunos());
        System.out.println(professor1);

        
    }
}
