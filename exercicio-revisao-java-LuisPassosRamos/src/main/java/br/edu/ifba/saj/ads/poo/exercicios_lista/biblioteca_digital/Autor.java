package br.edu.ifba.saj.ads.poo.exercicios_lista.biblioteca_digital;

public class Autor{
    private String nomeAutor;
    ArrayList<Livro> livro;

    public autor(String nomeAutor){
        this.nomeAutor = nomeAutor;
        this.livro = new ArrayList<>();
    }

    public ArrayList<Livro> getLivro() {
        return this.livro;
    }

    public String getNomeAutor() {
        return this.nomeAutor;
    }

    public void novoLivro(Livro livro) {
        this.livro.add(livro);
    }

    public void buscaLivro(String nomeLivro){
        for (Livro livro : this.livro){
            if (livro.getnomeLivro().equals(livroNome)) {
                return this.livro;
            }
        }
    }
}