package main;

import entidades.*;
import java.time.LocalDate;
import java.time.LocalTime;

/*Classe principal do sistema.*/

public class Main {

    public static void main(String[] args) {

        try {
            Curso curso = new Curso(1, "Violão", "6 meses", "Iniciante");
            curso.validarDados();

            Aluno aluno = new Aluno(1, "João", "99999-0000",
                    "A001", LocalDate.of(2002, 5, 10));
            aluno.validarDados();

            Professor professor = new Professor(1, "Carlos", "88888-1111",
                    "F001", 3000,
                    "12345678900", "Violão", "carlos@email.com");
            professor.validarDados();

            Aula aula = new Aula(1, LocalDate.now(),
                    LocalTime.of(19, 0), curso);

            Presenca presenca = new Presenca(aluno, aula, "Presente");
            presenca.registrar();

            System.out.println("Sistema executado com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
