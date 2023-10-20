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
        categoria.novoLivro(this);
        autor.novoLivro(this);
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public Autor getAutor() {
        return autor;
    }

    public String toString(){
        return "[Nome do livro: "+this.getNomeLivro()+"]\n[Categoria do livro: "+this.categorias.getName()+"]\n [Autor: "+this.getAutor()+"]";
    }
}