package academia;


public class Aluno {

    private static int contadorId = 1;

    private int id;

    private String nome;

    private int idade;


    public Aluno(String nome, int idade) {

        this.id = contadorId++;

        this.nome = nome;

        this.idade = idade;

    }


    public int getId() {

        return id;

    }


    public String getNome() {

        return nome;

    }


    public int getIdade() {

        return idade;

    }


    @Override

    public String toString() {

        return "Aluno{id=" + id + ", nome='" + nome + "', idade=" + idade + "}";

    }

}