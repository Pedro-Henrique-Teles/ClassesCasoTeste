package org.classes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClasseTest {
    private Estado estado;
    private Cidade cidade;
    private Aluno aluno;
    private Escola escola;
    private Curso curso;
    private Professor professor;
    private Escolaridade escolaridade;

    @BeforeEach
    public void setUp() {
        estado = new Estado();
        cidade = new Cidade();
        aluno = new Aluno();
        escola = new Escola();
        curso = new Curso();
        professor = new Professor();
        escolaridade = new Escolaridade();
    }

    @Test
    public void deveRetornarEstadoNaturalidadeAluno() {
        estado.setNome("Minas Gerais");
        cidade.setEstado(estado);
        aluno.setCidade(cidade);

        assertEquals("Minas Gerais", aluno.getCidade().getEstado().getNome());
    }

    @Test
    public void deveRetornarEstadoAlunoEstuda() {
        estado.setNome("Rio Grande do Sul");
        cidade.setEstado(estado);
        escola.setCidade(cidade);
        curso.setEscola(escola);
        aluno.setCurso(curso);

        assertEquals("Rio Grande do Sul", aluno.getCurso().getEscola().getCidade().getEstado().getNome());
    }

    @Test
    public void deveRetornarCoordenadorCursoAluno() {
        curso.setNomeCoordenador("Ricardio");
        aluno.setCurso(curso);

        assertEquals("Ricardio", aluno.getCurso().getNomeCoordenador());
    }

    @Test
    public void deveRetornarEscolaridadeCoordenador() {
        escolaridade.setNome("Doutorado");
        professor.setCoordenador(true);
        professor.setEscolaridade(escolaridade);

        assertEquals(true, professor.isCoordenador());
        assertEquals("Doutorado", professor.getEscolaridade().getNome());
    }

    @Test
    public void deveRetornarEscolaridadeDiretor() {
        escolaridade.setNome("Doutorado");
        professor.setDiretor(true);
        professor.setEscolaridade(escolaridade);

        assertEquals(true, professor.isDiretor());
        assertEquals("Doutorado", professor.getEscolaridade().getNome());
    }

    @Test
    public void deveRetornarEscolaridadeProfessor() {
        escolaridade.setNome("Doutorado");
        professor.setEscolaridade(escolaridade);

        assertEquals("Doutorado", professor.getEscolaridade().getNome());
    }

    @Test
    public void deveRetornarNaturalidadeProfessor() {
        cidade.setNome("Ouro Preto");
        professor.setCidade(cidade);

        assertEquals("Ouro Preto", professor.getCidade().getNome());
    }

    @Test
    public void deveRetornarTipoEnsinoProfessor() {
        TipoCurso tipoEnsino = new TipoCurso();
        tipoEnsino.setTipoDeEnsino("Ensino Médio");
        curso.setTipoEnsino(tipoEnsino);
        professor.setCurso(curso);

        assertEquals("Ensino Médio", professor.getCurso().getTipoEnsino().getTipoDeEnsino());
    }

    @Test
    public void deveRetornarDiretorProfessor(){
        curso.setEscola(escola);
        professor.setCurso(curso);
        curso.getEscola().setNomeDiretor("Rudolfo");

        assertEquals("Rudolfo", professor.getCurso().getEscola().getNomeDiretor());
    }

    @Test
    public void deveRetornarCoordenadorProfessor(){
        curso.setEscola(escola);
        professor.setCurso(curso);
        curso.getEscola().setNomeCoordenador("Claudete");

        assertEquals("Claudete", professor.getCurso().getEscola().getNomeCoordenador());
    }
}
