package br.com.academia;

import br.com.academia.model.*;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Academia academia = new Academia();
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Buscar Aluno por Nome");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome do aluno: ");
                    String nome = sc.nextLine();

                    System.out.print("Idade do aluno: ");
                    int idade = sc.nextInt();
                    sc.nextLine();

                    PlanoMensal plano = new PlanoMensal("Mensal", 99.90, 1);
                    Aluno aluno = new Aluno(nome, idade, plano);
                    academia.matricularAluno(aluno);

                    System.out.println("Aluno cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Nome do aluno para buscar: ");
                    String nomeBusca = sc.nextLine();

                    Aluno encontrado = academia.buscarAlunoPorNome(nomeBusca);
                    if (encontrado != null) {
                        System.out.println("Aluno encontrado: " + encontrado.getNome());
                        encontrado.mostrarTreinos();
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}


// Ainda precisa de manutenção para chamar a classe de cadastro de treinos
// Não consegue encontrar o aluno cadastrado