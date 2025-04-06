package br.com.academia.model;

public class Treinador {

    // Atributos
    private String nome;
    private String especialidade;

    // Construtor
    public Treinador(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    // Método exemplo
    public void criarTreinoParaAluno(Aluno aluno, Treino treino) {
        aluno.adicionarTreino(treino);
        System.out.println("Treino criado para " + aluno.getNome());
    }
}
