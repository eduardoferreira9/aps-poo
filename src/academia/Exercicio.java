package academia;

public class Exercicio {
    private String nome;

    public Exercicio(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Exercicio{nome='" + nome + "'}";
    }
}
