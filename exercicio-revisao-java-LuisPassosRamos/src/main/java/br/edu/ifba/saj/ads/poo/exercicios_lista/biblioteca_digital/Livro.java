package br.edu.ifba.saj.ads.poo.exercicios_lista.biblioteca_digital;
import java.util.ArrayList;

public class Livro{
    
    private ArrayList<Categoria> categorias; 
    private Autor autor;
    private String nomeLivro;

    public Livro(Autor autor, String nomeLivro, Categoria categoria){
        this.autor = autor;
        this.nomeLivro = nomeLivro;
        this.categorias = new ArrayList<>();
        this.categorias.add(categoria);
        categoria.novoLivro(this);
        autor.novoLivro(this);
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public Autor getAutor() {
        return autor;
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void novaCategoria(Categoria categoria){
        this.categorias.add(categoria);
    }

    public Categoria buscaCategoria(String nomeCategoria){
        for (Categoria categoria : this.categorias){
            if(categoria.getNomeCategoria().equals(nomeCategoria)){
                return categoria;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Livro [categorias=" + categorias + ", autor=" + autor + ", nomeLivro=" + nomeLivro + "]";
    }
}