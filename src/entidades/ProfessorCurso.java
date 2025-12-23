package entidades;

import interfaces.Relacionavel;
import excecoes.RelacaoInvalidaException;

/*Relação entre professor e curso.*/

public class ProfessorCurso implements Relacionavel {

    private Professor professor;
    private Curso curso;

    public ProfessorCurso(Professor professor, Curso curso) {
        this.professor = professor;
        this.curso = curso;
    }

    @Override
    public void validarRelacao() throws RelacaoInvalidaException {
        if (professor == null || curso == null) {
            throw new RelacaoInvalidaException("Professor e curso obrigatórios");
        }
    }

    public Professor getProfessor() { return professor; }
    public void setProfessor(Professor professor) { this.professor = professor; }

    public Curso getCurso() { return curso; }
    public void setCurso(Curso curso) { this.curso = curso; }
}
