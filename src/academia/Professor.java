package academia;

public class Professor {
    private static int contadorId = 1;
    private int id;
    private String nome;
    private String especialidade;

    public Professor(String nome, String especialidade) {
        this.id = contadorId++;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    @Override
    public String toString() {
        return "Professor: nome= " + nome + " especialidade= " + especialidade;
    }
}
