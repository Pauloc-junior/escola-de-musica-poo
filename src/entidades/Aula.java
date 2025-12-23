package entidades;

import java.time.LocalDate;
import java.time.LocalTime;

/*Classe que representa uma aula.*/

public class Aula {

    private int id;
    private LocalDate data;
    private LocalTime horario;
    private Curso curso;

    public Aula(int id, LocalDate data, LocalTime horario, Curso curso) {
        this.id = id;
        this.data = data;
        this.horario = horario;
        this.curso = curso;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    public LocalTime getHorario() { return horario; }
    public void setHorario(LocalTime horario) { this.horario = horario; }

    public Curso getCurso() { return curso; }
    public void setCurso(Curso curso) { this.curso = curso; }
}
