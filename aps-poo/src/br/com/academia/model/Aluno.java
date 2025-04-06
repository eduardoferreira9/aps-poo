package br.com.academia.model;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    // Atributos
    private String nome;
    private int idade;
    private PlanoMensal plano;
    private List<Treino> listaTreinos;

    // Construtor
    public Aluno(String nome, int idade, PlanoMensal plano) {
        this.nome = nome;
        this.idade = idade;
        this.plano = plano;
        this.listaTreinos = new ArrayList<>();
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public PlanoMensal getPlano() {
        return plano;
    }

    public void setPlano(PlanoMensal plano) {
        this.plano = plano;
    }

    public List<Treino> getListaTreinos() {
        return listaTreinos;
    }

    // Métodos
    public void adicionarTreino(Treino treino) {
        listaTreinos.add(treino);
    }

    public void mostrarTreinos() {
        if (listaTreinos.isEmpty()) {
            System.out.println("Nenhum treino cadastrado.");
        } else {
            for (Treino treino : listaTreinos) {
                System.out.println(treino); // Assumindo que Treino tem toString()
            }
        }
    }
}
