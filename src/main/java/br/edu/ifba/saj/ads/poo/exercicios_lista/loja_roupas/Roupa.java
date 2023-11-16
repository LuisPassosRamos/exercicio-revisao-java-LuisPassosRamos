package br.edu.ifba.saj.ads.poo.exercicios_lista.loja_roupas;

public class Roupa {
    private String nomeRoupa;
    private Departamento departamento;
    private float preco;
    private Tamanho tamanho;
    private String cor;
    private static int id;

    public Roupa(String nomeRoupa, Departamento departamento, String cor, Tamanho tamanho, float preco){
        this.nomeRoupa = nomeRoupa.toUpperCase().trim();
        this.departamento = departamento;
        this.preco = preco;
        this.tamanho = tamanho;
        this.cor = cor;
        Roupa.id++;
    }

    public Departamento getDepartamento() {
        return this.departamento;
    }

    public String getNomeRoupa() {
        return nomeRoupa;
    }

    public void setNomeRoupa(String nomeRoupa) {
        this.nomeRoupa = nomeRoupa;
    }

    public float getPreco() {
        return preco;
    }

    public String getCor() {
        return cor;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public static int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "\n Roupa [nomeRoupa=" + nomeRoupa + ", preco=" + preco + ", tamanho=" + tamanho + ", cor=" + cor + ", id=" + Roupa.id + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nomeRoupa == null) ? 0 : nomeRoupa.hashCode());
        result = prime * result + ((departamento == null) ? 0 : departamento.hashCode());
        result = prime * result + Float.floatToIntBits(preco);
        result = prime * result + ((tamanho == null) ? 0 : tamanho.hashCode());
        result = prime * result + ((cor == null) ? 0 : cor.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Roupa other = (Roupa) obj;
        if (nomeRoupa == null) {
            if (other.nomeRoupa != null)
                return false;
        } else if (!nomeRoupa.equals(other.nomeRoupa))
            return false;
        if (departamento == null) {
            if (other.departamento != null)
                return false;
        } else if (!departamento.equals(other.departamento))
            return false;
        if (Float.floatToIntBits(preco) != Float.floatToIntBits(other.preco))
            return false;
        if (tamanho != other.tamanho)
            return false;
        if (cor == null) {
            if (other.cor != null)
                return false;
        } else if (!cor.equals(other.cor))
            return false;
        return true;
    }
}
