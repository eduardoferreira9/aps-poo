package academia;

import java.util.List;
import java.util.Scanner;

public class AcademiaSystem {
    private static Academia academia = new Academia();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bem-vindo ao sistema da Academia!");

        boolean sair = false;
        while (!sair) {
            mostrarMenu();
            int opcao = lerInteiro("Escolha uma opção: ");
            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    cadastrarProfessor();
                    break;
                case 3:
                    cadastrarExercicio();
                    break;
                case 4:
                    criarTreino();
                    break;
                case 5:
                    adicionarExercicioNoTreino();
                    break;
                case 6:
                    consultarTreinosPorAluno();
                    break;
                case 7:
                    listarAlunos();
                    break;
                case 8:
                    listarProfessores();
                    break;
                case 9:
                    listarExercicios();
                    break;
                case 0:
                    sair = true;
                    System.out.println("Saindo do sistema. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            System.out.println();
        }

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("=== Menu da Academia ===");
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Cadastrar Professor");
        System.out.println("3 - Cadastrar Exercício");
        System.out.println("4 - Criar Treino");
        System.out.println("5 - Adicionar Exercício ao Treino");
        System.out.println("6 - Consultar Treinos por Aluno");
        System.out.println("7 - Listar Alunos");
        System.out.println("8 - Listar Professores");
        System.out.println("9 - Listar Exercícios");
        System.out.println("0 - Sair");
    }

    private static void cadastrarAluno() {
        System.out.println("Cadastro de Aluno");
        String nome = lerTexto("Digite o nome do aluno: ");
        int idade = lerInteiro("Digite a idade do aluno: ");
        academia.cadastrarAluno(nome, idade);
    }

    private static void cadastrarProfessor() {
        System.out.println("Cadastro de Professor");
        String nome = lerTexto("Digite o nome do professor: ");
        String especialidade = lerTexto("Digite a especialidade do professor: ");
        academia.cadastrarProfessor(nome, especialidade);
    }

    private static void cadastrarExercicio() {
        System.out.println("Cadastro de Exercício");
        String nome = lerTexto("Digite o nome do exercício: ");
        String descricao = lerTexto("Digite a descrição do exercício: ");
        academia.cadastrarExercicio(nome, descricao);
    }

    private static void criarTreino() {
        System.out.println("Criar Treino");
        String nomeAluno = lerTexto("Digite o nome do aluno: ");
        String nomeProfessor = lerTexto("Digite o nome do professor: ");
        Treino treino = academia.criarTreino(nomeAluno, nomeProfessor);
        if (treino == null) {
            System.out.println("Não foi possível criar o treino.");
        }
    }

    private static void adicionarExercicioNoTreino() {
        System.out.println("Adicionar Exercício ao Treino");
        String nomeAluno = lerTexto("Digite o nome do aluno: ");
        List<Treino> treinos = academia.consultarTreinosPorAluno(nomeAluno);
        if (treinos.isEmpty()) {
            System.out.println("Nenhum treino encontrado para o aluno " + nomeAluno);
            return;
        }
        System.out.println("Treinos do aluno " + nomeAluno + ":");
        for (int i = 0; i < treinos.size(); i++) {
            System.out.println((i + 1) + " - " + treinos.get(i));
        }
        int escolha = lerInteiro("Escolha o número do treino para adicionar o exercício: ");
        if (escolha < 1 || escolha > treinos.size()) {
            System.out.println("Escolha inválida.");
            return;
        }
        Treino treinoEscolhido = treinos.get(escolha - 1);
        String nomeExercicio = lerTexto("Digite o nome do exercício a ser adicionado: ");
        academia.adicionarExercicioNoTreino(treinoEscolhido, nomeExercicio);
    }

    private static void consultarTreinosPorAluno() {
        System.out.println("Consultar Treinos por Aluno");
        String nomeAluno = lerTexto("Digite o nome do aluno: ");
        List<Treino> treinos = academia.consultarTreinosPorAluno(nomeAluno);
        if (treinos.isEmpty()) {
            System.out.println("Nenhum treino encontrado para o aluno " + nomeAluno);
        } else {
            System.out.println("Treinos do aluno " + nomeAluno + ":");
            for (Treino t : treinos) {
                System.out.println(t);
            }
        }
    }

    private static void listarAlunos() {
        academia.listarAlunos();
    }

    private static void listarProfessores() {
        academia.listarProfessores();
    }

    private static void listarExercicios() {
        academia.listarExercicios();
    }

    // Utilitários para leitura
    private static String lerTexto(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine().trim();
    }

    private static int lerInteiro(String mensagem) {
        int valor = -1;
        while (true) {
            System.out.print(mensagem);
            String entrada = scanner.nextLine().trim();
            try {
                valor = Integer.parseInt(entrada);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido.");
            }
        }
        return valor;
    }
}
