package CLEITON_MARTINS.primeirobi.prova;

import javax.swing.plaf.synth.SynthScrollBarUI;

import java.util.Scanner;

import java.lang.runtime.SwitchBootstraps;

import java.util.ArrayList;

import java.util.List;

import java.util.Date;

public class Main 
{
    // Eliane, bibliotecária do Centro Universitário FAG está precisando de um sistema com os seguintes requisitos:
    // Cadastro de Alunos;
    // Cadastro de Livros;
    // Busca por Título;
    // Busca por Autor;
    // Realizar Empréstimo;
    // Realizar Devolução;
    // Verificar a disponibilidade de empréstimo;
    // Criar multa de atraso após 7 dias no valor de 3,50 a diária.
    
    public static void main(String[] args)
    {
        ApresentarSe inicial = new ApresentarSe();
        inicial.menuInicial();
        
        Scanner scanner = new Scanner(System.in);
        int op = scanner.nextInt();
        
        switch (op) 
        {
            case 1:
                Livros livroUm = new Livros();
                livroUm.titulo = "titulo1";
                livroUm.autor = "autor1";            
                break;
            
            case 2:
                Alunos alunoUm = new Alunos();
                alunoUm.nome = "nome1";
                alunoUm.curso = "curso1";
                alunoUm.periodo = "periodo1";
                break;

            case 3:
                Emprestimo emprestimoUm = new Emprestimo();
                emprestimoUm.arrayEmprestimo[0] = "titulo1" + "autor1";
                break;
                
            case 4:
                Scanner devolucao = new Scanner(System.in);
                String livro;
                System.out.println("Informe o título do livro que está devolvendo");
                livro = devolucao.next();
                if (livro == "titulo1")
                {
                    System.out.println("livro devolvido com sucesso");
                }
                break;
                
            default:
                System.out.println("Insira uma alternativa válida!");
                break;
            }

            Livros cadastroUm = new Livros();
            cadastroUm.arrayTitulo[0] = "titulo1";
            cadastroUm.arrayAutor[0] = "autor1";
            
            System.out.println(cadastroUm.arrayTitulo[0]);
            System.out.println(cadastroUm.arrayAutor[0]);
        }
}
