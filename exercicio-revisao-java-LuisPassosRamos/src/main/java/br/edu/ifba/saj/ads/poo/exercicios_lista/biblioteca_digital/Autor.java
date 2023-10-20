package br.edu.ifba.saj.ads.poo.exercicios_lista.biblioteca_digital;

public class Autor{
    private String nomeAutor;
    ArrayList<Livro> livro;

    public autor(String nomeAutor){
        livro = new ArrayList<>();
    }

    public ArrayList<Livro> getLivro() {
        return livro;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void novoLivro(Livro livro) {
        this.livro.add(livro);
    }
}