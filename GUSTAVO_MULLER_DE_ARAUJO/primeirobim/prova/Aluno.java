package GUSTAVO_MULLER_DE_ARAUJO.primeirobim.prova;

import java.util.Scanner;


public class Aluno {


    public String nome;

    public String idade;

    public int [] id;


    public void cadastraAluno () {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Cadastro de alunos");
        Aluno[] alunos = new Aluno[2];
        
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Aluno " + (i + 1));
            
            System.out.println("Insira o nome do aluno");
            String nomeAluno = scanner.next();

            System.out.println("Insira a idade do aluno");
            String idadeAluno = scanner.next();

            Aluno novoAluno = new Aluno();
            novoAluno.nome = nomeAluno;
            novoAluno.idade = idadeAluno;
            alunos[i] = novoAluno;
            
        }
        for (Aluno aluno : alunos) {
            System.out.println("Nome do aluno: " + aluno.nome + "\n" + "Idade do aluno: " + aluno.idade + "\n");
        }
        
    }
}
