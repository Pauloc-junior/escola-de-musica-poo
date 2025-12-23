package entidades;

import interfaces.Cadastravel;
import excecoes.CampoObrigatorioException;

/*Classe que representa um curso.*/

public class Curso implements Cadastravel {

    private int id;
    private String nome;
    private String duracao;
    private String nivel;

    public Curso(int id, String nome, String duracao, String nivel) {
        this.id = id;
        this.nome = nome;
        this.duracao = duracao;
        this.nivel = nivel;
    }

    @Override
    public void validarDados() throws CampoObrigatorioException {
        if (nome == null || nome.isEmpty()) {
            throw new CampoObrigatorioException("Nome do curso obrigatório");
        }
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDuracao() { return duracao; }
    public void setDuracao(String duracao) { this.duracao = duracao; }

    public String getNivel() { return nivel; }
    public void setNivel(String nivel) { this.nivel = nivel; }
}
