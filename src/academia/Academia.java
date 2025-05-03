package academia;

import java.util.ArrayList;
import java.util.List;

public class Academia {
    private List<Aluno> alunos;
    private List<Professor> professores;
    private List<Exercicio> exercicios;
    private List<Treino> treinos;

    public Academia() {
        alunos = new ArrayList<>();
        professores = new ArrayList<>();
        exercicios = new ArrayList<>();
        treinos = new ArrayList<>();
    }

    public void cadastrarAluno(String nome, int idade) {
        Aluno novoAluno = new Aluno(nome, idade);
        alunos.add(novoAluno);
        System.out.println("Aluno cadastrado: " + novoAluno);
    }

    public void cadastrarProfessor(String nome, String especialidade) {
        Professor prof = new Professor(nome, especialidade);
        professores.add(prof);
        System.out.println("Professor cadastrado: " + prof);
    }

    public void cadastrarExercicio(String nome) {
        Exercicio ex = new Exercicio(nome);
        exercicios.add(ex);
        System.out.println("Exercício cadastrado: " + ex);
    }

    public Treino criarTreino(String nomeAluno, String nomeProfessor) {
        Aluno aluno = buscarAlunoPorNome(nomeAluno);
        Professor professor = buscarProfessorPorNome(nomeProfessor);
        if (aluno == null) {
            System.out.println("Aluno não encontrado para criar treino.");
            return null;
        }
        if (professor == null) {
            System.out.println("Professor não encontrado para criar treino.");
            return null;
        }
        Treino treino = new Treino(aluno, professor);
        treinos.add(treino);
        System.out.println("Treino criado: " + treino);
        return treino;
    }

    public void adicionarExercicioNoTreino(Treino treino, String nomeExercicio) {
        if (treino == null) {
            System.out.println("Treino inválido.");
            return;
        }
        Exercicio ex = buscarExercicioPorNome(nomeExercicio);
        if (ex == null) {
            System.out.println("Exercício não encontrado: " + nomeExercicio);
            return;
        }
        treino.adicionarExercicio(ex);
        System.out.println("Exercício " + nomeExercicio + " adicionado ao treino do aluno " + treino.getAluno().getNome());
    }

    public Aluno buscarAlunoPorNome(String nome) {
        for (Aluno a : alunos) {
            if (a.getNome().equalsIgnoreCase(nome)) {
                return a;
            }
        }
        return null;
    }

    public Professor buscarProfessorPorNome(String nome) {
        for (Professor p : professores) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }

    public Exercicio buscarExercicioPorNome(String nome) {
        for (Exercicio e : exercicios) {
            if (e.getNome().equalsIgnoreCase(nome)) {
                return e;
            }
        }
        return null;
    }

    public List<Treino> consultarTreinosPorAluno(String nomeAluno) {
        List<Treino> resultado = new ArrayList<>();
        for (Treino t : treinos) {
            if (t.getAluno().getNome().equalsIgnoreCase(nomeAluno)) {
                resultado.add(t);
            }
        }
        return resultado;
    }

    // Métodos adicionais para listar registros
    public void listarAlunos() {
        System.out.println("Lista de Alunos:");
        for (Aluno a : alunos) {
            System.out.println(a);
        }
    }

    public void listarProfessores() {
        System.out.println("Lista de Professores:");
        for (Professor p : professores) {
            System.out.println(p);
        }
    }

    public void listarExercicios() {
        System.out.println("Lista de Exercícios:");
        for (Exercicio e : exercicios) {
            System.out.println(e);
        }
    }
}
