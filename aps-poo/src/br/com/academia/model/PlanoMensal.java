package br.com.academia.model;

public class PlanoMensal {

    // Atributos
    private String tipo; // Ex: Mensal, Trimestral, Anual
    private double preco;
    private int duracaoMeses;

    // Construtor
    public PlanoMensal(String tipo, double preco, int duracaoMeses) {
        this.tipo = tipo;
        this.preco = preco;
        this.duracaoMeses = duracaoMeses;
    }

    // Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getDuracaoMeses() {
        return duracaoMeses;
    }

    public void setDuracaoMeses(int duracaoMeses) {
        this.duracaoMeses = duracaoMeses;
    }

    // Método útil
    public void mostrarPlano() {
        System.out.println("Plano: " + tipo + " | R$" + preco + " | " + duracaoMeses + " meses");
    }

    @Override
    public String toString() {
        return tipo + " - R$" + preco + " (" + duracaoMeses + " meses)";
    }
}
