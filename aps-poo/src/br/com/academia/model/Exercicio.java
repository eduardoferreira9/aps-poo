package br.com.academia.model;

public class Exercicio {

    // Atributos
    private String nome;
    private String grupoMuscular;
    private int series;
    private int repeticoes;

    // Construtor
    public Exercicio(String nome, String grupoMuscular, int series, int repeticoes) {
        this.nome = nome;
        this.grupoMuscular = grupoMuscular;
        this.series = series;
        this.repeticoes = repeticoes;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGrupoMuscular() {
        return grupoMuscular;
    }

    public void setGrupoMuscular(String grupoMuscular) {
        this.grupoMuscular = grupoMuscular;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    // Método útil
    public void mostrarDetalhes() {
        System.out.println(nome + " - " + grupoMuscular + " | " + series + "x" + repeticoes);
    }

    @Override
    public String toString() {
        return nome + " - " + grupoMuscular + " (" + series + "x" + repeticoes + ")";
    }
}
