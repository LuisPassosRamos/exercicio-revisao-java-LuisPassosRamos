package br.edu.ifba.saj.ads.poo.exercicios_lista.biblioteca_digital;

import java.util.ArrayList;

public class Categoria {
    private String nomeCategoria;
    private ArrayList<Livro> livros;

    public Categoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
        this.livros = new ArrayList<>();

    }

    public ArrayList<Livro> getLivro() {
        return this.livros;
    }

    public String getNomeCategoria() {
        return this.nomeCategoria;
    }

    public void novoLivro(Livro livro) {
        this.livros.add(livro);
    }

    public Livro buscaLivro(String livroNome) {
        for (Livro livro : this.livros) {
            if (livro.getNomeLivro().equals(livroNome)) {
                return livro;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Categoria [nomeCategoria=" + nomeCategoria + ", livros=" + livros + "]";
    }
}