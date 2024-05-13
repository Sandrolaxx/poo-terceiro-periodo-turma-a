package MATEUS_MASSUCATTO_DUARTE.primeirobimestre.prova;

import java.util.Date;
import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        Aluno alunoUm = new Aluno(null, null, 0);
        System.out.println("Digite o nome do aluno: ");
        alunoUm.nomeAluno = scanner.next();
        System.out.println("Digite a turma do aluno: ");
        alunoUm.turmaAluno = scanner.next();
        System.out.println("Digite a idade do aluno: ");
        alunoUm.idadeAluno = scanner.nextInt();
        alunoUm.apresentarAluno();

        Aluno alunoDois = new Aluno(null, null, 0);
        System.out.println("Digite o nome do segundo aluno: ");
        alunoDois.nomeAluno = scanner.next();
        System.out.println("Digite a turma do segundo aluno: ");
        alunoDois.turmaAluno = scanner.next();
        System.out.println("Digite a idade do segundo aluno: ");
        alunoDois.idadeAluno = scanner.nextInt();
        alunoDois.apresentarAluno();

        Livro livroUm = new Livro(null, null, 0);
        System.out.println("Digite o título do livro: ");
        livroUm.tituloLivro = scanner.next();
        System.out.println("Digite o autor do livro: ");
        livroUm.autorLivro = scanner.next();
        System.out.println("Digite a data de publicação do livro: ");
        livroUm.dataLivro = scanner.nextInt();
        livroUm.apresentarLivro();

        Livro livroDois = new Livro(null, null, 0);
        System.out.println("Digite o título do livro dois: ");
        livroDois.tituloLivro = scanner.next();
        System.out.println("Digite o autor do livro dois: ");
        livroDois.autorLivro = scanner.next();
        System.out.println("Digite a data de lançamento do livro: ");
        livroDois.dataLivro = scanner.nextInt();
        livroDois.apresentarLivro();

        int buscaLivro;
        System.out.println("Deseja buscar um livro por título? Digite 1 se sim: ");
        buscaLivro = scanner.nextInt();
        if (buscaLivro == 1)
        {
            System.out.println("Digite o título do livro: ");
            String buscaTitulo = scanner.next();
            if (buscaTitulo.equals(livroUm.tituloLivro))
            {
                System.out.println("Livro " + livroUm.tituloLivro + " encontrado");
            }
            else if (buscaTitulo.equals(livroDois.tituloLivro))
            {
                System.out.println("Livro " + livroDois.tituloLivro + " encontrado");
            }
            else
            {
                System.out.println("Nehum livro com título " + buscaTitulo + " encontrado");
            }
        }

        System.out.println("Deseja buscar um livro por autor? Digite 1 se sim: ");
        int pesquisaAutor = scanner.nextInt();
        if (pesquisaAutor == 1)
        {
            System.out.println("Digite o autor do livro: ");
            String buscaAutor = scanner.next();
            if (buscaAutor.equals(livroDois.autorLivro))
            {
                System.out.println("Autor " + livroUm.autorLivro + " encontrado");
            }
            else if (buscaAutor.equals(livroDois.autorLivro))
            {
                System.out.println("Autor " + livroDois.autorLivro + " encontrado");
            }
            else
            {
                System.out.println("Nenhum livro do autor " + buscaAutor + " encontrado");
            }
        }
        
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.dataEmprestimo = new Date();
        emprestimo.multaEmprestimo = new Date(emprestimo.dataEmprestimo.getTime() + 7 * 24 * 60 * 60 * 1000);
        Emprestimo calculaEmprestimo = new Emprestimo();
        calculaEmprestimo.confirmarMulta(calculaEmprestimo);

        scanner.close();
    }
}
