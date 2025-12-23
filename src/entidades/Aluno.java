package entidades;

import interfaces.Cadastravel;
import excecoes.CampoObrigatorioException;
import java.time.LocalDate;

/* Classe que representa um aluno.*/


public class Aluno extends Pessoa implements Cadastravel {

    private String matricula;
    private LocalDate dataNascimento;

    public Aluno(int id, String nome, String telefone, String matricula, LocalDate dataNascimento) {
        super(id, nome, telefone);
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public void validarDados() throws CampoObrigatorioException {
        if (matricula == null || matricula.isEmpty()) {
            throw new CampoObrigatorioException("Matrícula obrigatória");
        }
    }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public LocalDate getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
