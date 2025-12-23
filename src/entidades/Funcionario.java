package entidades;

/*Classe que representa um funcionário da escola.*/

public abstract class Funcionario extends Pessoa {

    protected String matriculaFuncional;
    protected double salario;

    public Funcionario(int id, String nome, String telefone, String matriculaFuncional, double salario) {
        super(id, nome, telefone);
        this.matriculaFuncional = matriculaFuncional;
        this.salario = salario;
    }

    public String getMatriculaFuncional() { return matriculaFuncional; }
    public void setMatriculaFuncional(String matriculaFuncional) {
        this.matriculaFuncional = matriculaFuncional;
    }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
}
