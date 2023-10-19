package br.edu.ifba.saj.ads.poo.exercicios_lista.biblioteca_digital;

import java.util.List;
import java.util.ArrayList;

public class Categoria {
    private String nomeCategoria;
    private ArrayList<Livro> livro;

    public Categoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;

    }

    public ArrayList<Livro> getLivro() {
        return livro;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void novoLivro(Livro livro) {
        this.livro.add(livro);
    }

    public Livro buscaLivro(String livroNome) {
        for (Livro livro : this.livro) {
            if (livro.getnomeLivro().equals(livroNome)) {
                return this.livro;
            }
        }
    }
}