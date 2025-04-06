package br.com.academia.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Treino {

    // Atributos
    private Date data;
    private List<Exercicio> listaExercicios;

    // Construtor
    public Treino(Date data) {
        this.data = data;
        this.listaExercicios = new ArrayList<>();
    }

    // Getters e Setters
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<Exercicio> getListaExercicios() {
        return listaExercicios;
    }

    // Métodos
    public void adicionarExercicio(Exercicio exercicio) {
        listaExercicios.add(exercicio);
    }

    public void mostrarTreino() {
        System.out.println("Treino do dia: " + data);
        for (Exercicio ex : listaExercicios) {
            ex.mostrarDetalhes();
        }
    }

    @Override
    public String toString() {
        return "Treino de " + data + " com " + listaExercicios.size() + " exercícios";
    }
}
