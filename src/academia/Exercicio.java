package academia;

public class Exercicio {
    private String nome;
    private String descricao;

    public Exercicio(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Exercicio{nome='" + nome + "', descricao='" + descricao + "'}";
    }
}
