package entidades;

import interfaces.Cadastravel;
import excecoes.CampoObrigatorioException;

/*Classe que representa um professor.*/

public class Professor extends Funcionario implements Cadastravel {

    private String cpf;
    private String especialidade;
    private String email;

    public Professor(int id, String nome, String telefone,
                     String matriculaFuncional, double salario,
                     String cpf, String especialidade, String email) {
        super(id, nome, telefone, matriculaFuncional, salario);
        this.cpf = cpf;
        this.especialidade = especialidade;
        this.email = email;
    }

    @Override
    public void validarDados() throws CampoObrigatorioException {
        if (cpf == null || cpf.isEmpty()) {
            throw new CampoObrigatorioException("CPF obrigatório");
        }
    }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getEspecialidade() { return especialidade; }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
