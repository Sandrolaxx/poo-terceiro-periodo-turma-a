package JUAN_GABRIEL_GARCIA.primeirobi.prova;

import java.util.Scanner;

public class ProvaMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int escolha = 1;
        int escolhaBusca = 0;

        Aluno aluno = new Aluno();
        Livro livro = new Livro();

        while (escolha != 0) {

            System.out.println(
                    "\nEscolha um das opções abaixo:\n1. Cadastrar aluno\n2. Cadastrar livro\n3. Buscar livro\n4. Realizar devolução\n5. Listar livros");
            escolha = scan.nextInt();

            switch (escolha) {
                case 1:

                    aluno.cadastrarAluno();

                    break;

                case 2:

                    livro.cadastrarLivro();

                    break;

                case 3:

                    System.out.println(
                            "Voce deseja buscar pelo título do livro ou por seu autor? Digite\n1 - Título\n2 - Autor");
                    escolhaBusca = scan.nextInt();

                    switch (escolhaBusca) {
                        case 1:

                            livro.buscarPorTitulo();
                            break;
                        case 2:

                            livro.buscarPorAutor();
                            break;
                        default:

                            System.out.println("Opção inválida!");
                            break;
                    }

                    break;

                case 4:

                    livro.devolucaoLivro();
                    break;

                case 5:
                
                // livro.listarLivros();
                    break;
                case 0:
                    System.out.println("Encerrando sistema");
                    break;

                default:
                    break;
            }
        }
    }
}