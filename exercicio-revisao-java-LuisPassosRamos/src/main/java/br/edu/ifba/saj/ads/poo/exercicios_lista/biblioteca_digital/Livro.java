package br.edu.ifba.saj.ads.poo.exercicios_lista.biblioteca_digital;
import java.util.List;
import java.util.ArrayList;

public class Livro{
    
    private Categoria categorias; 
    private Autor autor;
    private String nomeLivro;

    public Livro(Autor autor, String nomeLivro, Categoria categoria){
        this.autor = autor;
        this.nomeLivro = nomeLivro;
        this.categorias = categoria;
        novoLivro(this);
    }

    public Autor getAutor() {
        return autor;
    }

    public String toString(){
        return "[Nome do livro: "+this.nomeLivro+"]\n[Categoria do livro: "+this.categorias.getName()+"]\n [Autor: "+autor+"]";
    }
}