package GUSTAVO_MULLER_DE_ARAUJO.primeirobim.prova;

import java.util.Scanner;
import java.util.Date;


public class Emprestimo {
    
    Scanner scanner = new Scanner(System.in);

    public void realizarEmprestimo () {
    
        System.out.println("Insira seu nome");
        String nomeAluno =  scanner.next();

        System.out.println("Insira o nome do livro");
        String nomeLivro =  scanner.next();

        System.out.println("Insira o ID do livro");
        int idLivro = scanner.nextInt();

        Date date = new Date();
        Date dataVencida = new Date();
        dataVencida.setDate(dataVencida.getDate() + 7);
       
        System.out.println("Nome do aluno: " + nomeAluno + "\n" + "Nome do livro: " + nomeLivro + "\n" + "ID do livro: " + idLivro + "\n" +
        "Data de criação do empréstimo: " + date +"" + "\n" + "Data de vencimento do empréstimo: " + dataVencida);
        System.out.println("Empréstimo realizado com sucesso!");

    }

    public void realizarDevolucao () {

        Date date = new Date();
        Date devolucaoDate = new Date();
        devolucaoDate.setDate(devolucaoDate.getDate() + 7);

        System.out.println("Dia em que voce fez o empréstimo " + date);
        System.out.println("Dia da devolução " + devolucaoDate);

        }

}
