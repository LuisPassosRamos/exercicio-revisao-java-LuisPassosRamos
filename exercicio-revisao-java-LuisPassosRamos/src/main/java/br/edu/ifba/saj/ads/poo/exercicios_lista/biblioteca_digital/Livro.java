package br.edu.ifba.saj.ads.poo.exercicios_lista.biblioteca_digital;

public class Livro{
    
    private ArrayList<Categoria> categorias; 
    private Autor autor;

    public livro(Autor autor){
        this.autor = autor;
        this.categorias = new ArrayList();
    }

}