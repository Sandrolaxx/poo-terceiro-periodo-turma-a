package JUAN_GABRIEL_GARCIA.primeirobi.prova;

import java.util.Scanner;

public class Aluno {

    Scanner scan = new Scanner(System.in);
    
    private String nome, id;

    private Aluno[] aluno = new Aluno[100];


    public Aluno(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    public Aluno() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }


    public void cadastrarAluno() {

        System.out.println("Digite o nome do aluno:");
        nome = scan.next();
        System.out.println("Digite o id do aluno:");
        id = scan.next();

        for (int i = 0; i < aluno.length; i++) {
            
            if (aluno[i] == null) {
                aluno[i] = new Aluno(nome, id);
                break;
            }
        }
    }
}
