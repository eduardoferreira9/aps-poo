package br.com.academia.model;

import java.util.ArrayList;
import java.util.List;

public class Academia {

    // Atributos
    private List<Aluno> listaAlunos;
    private List<Treinador> listaTreinadores;

    // Construtor
    public Academia() {
        this.listaAlunos = new ArrayList<>();
        this.listaTreinadores = new ArrayList<>();
    }

    // Métodos
    public Aluno buscarAlunoPorNome(String nome) {
        for (Aluno aluno : listaAlunos) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                return aluno;
            }
        }
        return null;
    }
    
    public void matricularAluno(Aluno aluno) {
        listaAlunos.add(aluno);
        System.out.println("Aluno matriculado: " + aluno.getNome());
    }

    public void adicionarTreinador(Treinador treinador) {
        listaTreinadores.add(treinador);
        System.out.println("Treinador adicionado: " + treinador.getNome());
    }

    public void listarAlunos() {
        System.out.println("Alunos matriculados:");
        for (Aluno aluno : listaAlunos) {
            System.out.println("- " + aluno.getNome());
        }
    }

    public void listarTreinadores() {
        System.out.println("Treinadores:");
        for (Treinador treinador : listaTreinadores) {
            System.out.println("- " + treinador.getNome() + " (" + treinador.getEspecialidade() + ")");
        }
    }

    // Getters
    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public List<Treinador> getListaTreinadores() {
        return listaTreinadores;
    }
}
