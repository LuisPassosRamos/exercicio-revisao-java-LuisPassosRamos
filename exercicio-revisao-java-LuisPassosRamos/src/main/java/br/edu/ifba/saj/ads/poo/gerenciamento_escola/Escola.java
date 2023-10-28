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

        Professor professor1 = new Professor("Leandro", "POO");
        Professor professor2 = new Professor("Ester", "LAB. REDES", turma1);
        Professor professor3 = new Professor("Flavio", "ANALISE E PROJETO DE SISTEMAS");
        Professor professor4 = new Professor("Yuri", "ESTRUTURA DE DADOS", turma2);
        Professor professor5 = new Professor("Bruno", "INGLES");
        Professor professor6 = new Professor("Teste", "TESTE", turma3);

        professor1.addTurma(turma1);
        professor3.addTurma(turma2);
        professor5.addTurma(turma3);

        for (int i = 0; i < 3; i++) {
            turma1.addAluno(new Aluno("Aluno " + (i + 1), (i + 1)));
            turma2.addAluno(new Aluno("Aluno " + (i + 1), (i + 1)));
            turma3.addAluno(new Aluno("Aluno " + (i + 1), (i + 1)));
        }

        for (int i = 0; i < 3; i++) {
            turma1.addProfessor(new Professor("Professor " + (i + 1), "Materia " + (i + 1)));
            turma2.addProfessor(new Professor("Professor " + (i + 1), "Materia " + (i + 1)));
            turma3.addProfessor(new Professor("Professor " + (i + 1), "Materia " + (i + 1)));
        }

        Aluno aluno1 = new Aluno("Luis", 15);
        Aluno aluno2 = new Aluno("Guilherme", 13);
        Aluno aluno3 = new Aluno("Anderson", 11);

        turma1.addAluno(aluno1);
        turma2.addAluno(aluno2);
        turma3.addAluno(aluno3);

        System.out.println(professor1);
        System.out.println(professor2);
        System.out.println(professor3);
        System.out.println(professor4);
        System.out.println(professor5);
        System.out.println(professor6);






    }
}
