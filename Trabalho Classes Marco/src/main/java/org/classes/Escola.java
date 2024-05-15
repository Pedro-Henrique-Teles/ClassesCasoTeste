package org.classes;

public class Escola extends Curso{
    private Cidade cidade;
    private String NomeDiretor;

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getNomeDiretor() {
        return NomeDiretor;
    }

    public void setNomeDiretor(String nomeDiretor) {
        NomeDiretor = nomeDiretor;
    }
}
