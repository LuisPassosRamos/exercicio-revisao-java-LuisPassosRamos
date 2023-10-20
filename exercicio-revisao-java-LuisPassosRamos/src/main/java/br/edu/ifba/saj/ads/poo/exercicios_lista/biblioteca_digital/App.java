package br.edu.ifba.saj.ads.poo.exercicios_lista.biblioteca_digital;
import java.util.List;
import java.util.ArrayList;
/*Crie um sistema de biblioteca digital com livros, autores e categorias. 
Os livros pertencem a autores, e cada livro pode ser classificado em uma ou mais categorias. 
Os usuários podem fazer pesquisas por autor ou categoria e visualizar os livros disponíveis. */

public class App {
    public static void main(String[] args) {
        Autor autor1 = new Autor("William Spilberg");
        Categoria categoria1 = new Categoria("Drama");
        Categoria categoria2 = new Categoria("Tragedia");
        Livro livro1 = new Livro(autor1, "Hamlet", categoria1);
        livro1.novaCategoria(categoria2);

        System.out.println(livro1.toString());
        System.out.println(livro1.getCategorias());
        System.out.println(livro1.getAutor());
        
        
    }
}