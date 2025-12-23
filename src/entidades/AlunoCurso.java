package entidades;

import interfaces.Relacionavel;
import excecoes.RelacaoInvalidaException;

/*Relação entre aluno e curso.*/

public class AlunoCurso implements Relacionavel {

    private Aluno aluno;
    private Curso curso;

    public AlunoCurso(Aluno aluno, Curso curso) {
        this.aluno = aluno;
        this.curso = curso;
    }

    @Override
    public void validarRelacao() throws RelacaoInvalidaException {
        if (aluno == null || curso == null) {
            throw new RelacaoInvalidaException("Aluno e curso obrigatórios");
        }
    }

    public Aluno getAluno() { return aluno; }
    public void setAluno(Aluno aluno) { this.aluno = aluno; }

    public Curso getCurso() { return curso; }
    public void setCurso(Curso curso) { this.curso = curso; }
}
