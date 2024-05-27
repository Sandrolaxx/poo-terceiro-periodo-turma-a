package IAN_SIVERIS.primeirobi.prova;

import java.util.Scanner;

public class CadastroAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem-vindo ao sistema de cadastro de alunos!");
        
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite a idade do aluno: ");
        int idade = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Digite a matrícula do aluno: ");
        String matricula = scanner.nextLine();
        
        System.out.println("\nAluno cadastrado com sucesso:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Matrícula: " + matricula);
        
        scanner.close();
    }
}
