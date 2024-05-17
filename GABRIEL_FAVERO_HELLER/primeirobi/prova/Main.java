package GABRIEL_FAVERO_HELLER.primeirobi.prova;

import java.util.Scanner;
// import java.util.ArrayList;
import java.util.Date;
// import java.util.List;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Date agora = new Date();
    private static Date dataEmprestimo = new Date();
    private static Long umDiaMs = 86400000l;
    private static Aluno aluno1;
    private static Livro[] livros = new Livro[10];
    private static Livro[] emprestados = new Livro[10];
    // private static List<Livro> lista = new ArrayList<>();

    

    public static void main(String[] args) {

        int option;
        do {
            System.out.println("\n======= MENU =======");
            System.out.println("[1] - Cadastrar aluno");
            System.out.println("[2] - Cadastrar livros");
            System.out.println("[3] - Buscar por título");
            System.out.println("[4] - Buscar por autor");
            System.out.println("[5] - Realizar empréstimo");
            System.out.println("[6] - Realizar devolução");
            System.out.println("====================");
            System.out.println("[0] - Sair do sistema");
            System.out.println("====================\n");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    cadastrarAluno();
                    break;

                case 2:
                    cadastrarLivro();
                    break;

                case 3:
                    buscarTitulo();
                    break;

                case 4:
                    buscarAutor();
                    break;

                case 5:
                    realizarEmprestimo();
                    break;

                case 6:
                    realizarDevolução();
                    break;

                // case 7:
                // listarLivros();
                // break;

                default:
                    System.out.println("Saindo do sistema...");
                    break;
            }
        } while (option < 8 && option > 0);
    }

    public static Date getAgora() {
        return agora;
    }

    public static void setAgora(Date agora) {
        Main.agora = agora;
    }

    public static Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public static void setDataEmprestimo(Date dataEmprestimo) {
        Main.dataEmprestimo = dataEmprestimo;
    }

    public static Long getUmDiaMs() {
        return umDiaMs;
    }

    public static void setUmDiaMs(Long umDiaMs) {
        Main.umDiaMs = umDiaMs;
    }

    static Aluno cadastrarAluno() {
        System.out.println("Nome: ");
        String nome = scanner.next();
        System.out.println("Curso: ");
        String curso = scanner.next();
        System.out.println("Período: ");
        int periodo = scanner.nextInt();
        Aluno aluno1 = new Aluno(nome, curso, periodo);
        return aluno1;
    }

    static void cadastrarLivro() {
        System.out.println("Título: ");
        String titulo = scanner.next();
        System.out.println("Autor: ");
        String autor = scanner.next();
        for (int i = 0; i <= livros.length; i++) {
            if (livros[i] == null) {
                livros[i] = new Livro(titulo, autor);
                // lista.add(livros[i]);
                break;
            }
        }
    }

    // static void listarLivros() {
    // if (livros[0] == null) {
    // System.out.println("Nenhum item cadastrado!");
    // } else {
    // for (int i = 0; i < livros.length; i++) {
    // if (livros[i] == null) {
    // break;
    // }
    // System.out.println(livros[i].getTitulo() + " - " + livros[i].getAutor());
    // }
    // }
    // }

    static void buscarTitulo() {
        String x;
        if (livros[0] == null) {
            System.out.println("Nenhum livro cadastrado!");
        } else {
            System.out.println("Qual título deseja buscar?");
            x = scanner.next();
            for (int i = 0; i < livros.length; i++) {
                if (livros[i].getTitulo().equals(x)) {
                    System.out.println(livros[i].getTitulo() + " - " + livros[i].getAutor());
                    break;
                } else {
                    System.out.println("Livro não encontrado!");
                }
            }
        }
    }

    static void buscarAutor() {
        String x;
        if (livros[0] == null) {
            System.out.println("Nenhum livro cadastrado!");
        } else {
            System.out.println("Qual autor deseja buscar?");
            x = scanner.next();
            for (int i = 0; i < livros.length; i++) {
                if (livros[i].getAutor().equals(x)) {
                    System.out.println(livros[i].getTitulo() + " - " + livros[i].getAutor());
                    break;
                } else {
                    System.out.println("Livro não encontrado!");
                }
            }
        }
    }

    static void realizarEmprestimo() {
        String x;
        if (livros[0] == null) {
            System.out.println("Nenhum livro cadastrado!");
        } else {
            System.out.println("Esses são os livros verificados disponíveis para empréstimo?");
            for (int i = 0; i < livros.length; i++) {
                if (livros[i] == null) {
                    break;
                }
                System.out.println(livros[i].getTitulo() + " - " + livros[i].getAutor());
            }
        }
        System.out.println("Qual livro deseja emprestar?");
        x = scanner.next();
        for (int i = 0; i < livros.length; i++) {
            if (livros[i].getTitulo().equals(x)) {
                System.out.println("Empréstimo realizado com sucesso!");
                System.out.println(
                        "Você emprestou o livro " + livros[i].getTitulo() + " do autor " + livros[i].getAutor());
                emprestados[i] = livros[i];
                setDataEmprestimo(dataEmprestimo = new Date());
                System.out.println(dataEmprestimo.toString());
                break;
            } else {
                System.out.println("Livro não encontrado!");
            }
        }
    }

    static void realizarDevolução() {
        String x;
        if (emprestados[0] == null) {
            System.out.println("Nenhum livro emprestado!");
            return;
        } else {
            System.out.println("Esses são os livros disponíveis para devolução?");
            for (int i = 0; i < emprestados.length; i++) {
                if (emprestados[i] == null) {
                    break;
                }
                System.out.println(emprestados[i].getTitulo() + " - " + emprestados[i].getAutor());
            }
        }
        System.out.println("Qual livro deseja devolver?");
        x = scanner.next();
        for (int i = 0; i < emprestados.length; i++) {
            if (emprestados[i].getTitulo().equals(x)) {
                System.out.println("Devolução realizada com sucesso!");
                System.out.println("Você devolveu o livro " + emprestados[i].getTitulo() + " do autor "
                        + emprestados[i].getAutor());
                livros[i] = emprestados[i];
                break;
            } else {
                System.out.println("Livro não encontrado!");
            }
        }
    }
}
