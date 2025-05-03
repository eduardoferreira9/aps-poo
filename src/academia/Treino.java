package academia;

import java.util.ArrayList;
import java.util.List;

public class Treino {
    private static int contadorId = 1;
    private int id;
    private Aluno aluno;
    private Professor professor;
    private List<Exercicio> exercicios;

    public Treino(Aluno aluno, Professor professor) {
        this.id = contadorId++;
        this.aluno = aluno;
        this.professor = professor;
        this.exercicios = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Exercicio> getExercicios() {
        return exercicios;
    }

    public void adicionarExercicio(Exercicio ex) {
        exercicios.add(ex);
    }

    @Override
    public String toString() {
        return "Treino: aluno: " + aluno.getNome() + " professor: " + professor.getNome() +
               " exercicios: " + exercicios;
    }
}
