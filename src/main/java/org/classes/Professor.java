package org.classes;

public class Professor extends Pessoa {
    private Curso curso;
    private boolean isDiretor;
    private boolean isCoordenador;
    private Escolaridade escolaridade;

    public boolean isCoordenador() {
        return isCoordenador;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }
    public String getNomeEscolaridade() {
        return this.escolaridade.getNome();
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public boolean isDiretor() {
        return isDiretor;
    }

    public void setDiretor(boolean diretor) {
        isDiretor = diretor;
    }


    public void setCoordenador(boolean coordenador) {
        isCoordenador = coordenador;
    }
}
