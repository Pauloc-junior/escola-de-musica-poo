package entidades;

import interfaces.Registravel;

/*Classe que representa o uso de instrumento.*/

public class UsoInstrumento implements Registravel {

    private Aluno aluno;
    private Instrumento instrumento;
    private Aula aula;

    public UsoInstrumento(Aluno aluno, Instrumento instrumento, Aula aula) {
        this.aluno = aluno;
        this.instrumento = instrumento;
        this.aula = aula;
    }

    @Override
    public void registrar() {
        System.out.println("Uso de instrumento registrado");
    }

    public Aluno getAluno() { return aluno; }
    public void setAluno(Aluno aluno) { this.aluno = aluno; }

    public Instrumento getInstrumento() { return instrumento; }
    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }

    public Aula getAula() { return aula; }
    public void setAula(Aula aula) { this.aula = aula; }
}
