package entidades;

import interfaces.Registravel;

/*Classe que representa a presença do aluno.*/

public class Presenca implements Registravel {

    private Aluno aluno;
    private Aula aula;
    private String status;

    public Presenca(Aluno aluno, Aula aula, String status) {
        this.aluno = aluno;
        this.aula = aula;
        this.status = status;
    }

    @Override
    public void registrar() {
        System.out.println("Presença registrada");
    }

    public Aluno getAluno() { return aluno; }
    public void setAluno(Aluno aluno) { this.aluno = aluno; }

    public Aula getAula() { return aula; }
    public void setAula(Aula aula) { this.aula = aula; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
