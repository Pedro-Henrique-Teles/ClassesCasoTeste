package org.classes;

public class Curso {
    private Escola escola;
    private String NomeCoordenador;
    private TipoCurso tipoEnsino;

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public TipoCurso getTipoEnsino() {
        return tipoEnsino;
    }

    public void setTipoEnsino(TipoCurso tipoEnsino) {
        this.tipoEnsino = tipoEnsino;
    }

    public String getNomeCoordenador() {
        return NomeCoordenador;
    }

    public void setNomeCoordenador(String nomeCoordenador) {
        NomeCoordenador = nomeCoordenador;
    }
}
