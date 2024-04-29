package GABRIEL_SCHIESTL.PRIMEIRO_BIMESTRE.prova;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Biblioteca {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Aluno[] students = new Aluno[100];
        Livro[] books = new Livro[100];

        int option;

        do {

            System.out.println("Digite uma opção:");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Cadastrar livro");
            System.out.println("3 - Buscar por título");
            System.out.println("4 - Buscar por autor");
            System.out.println("5 - Realizar empréstimo");
            System.out.println("6 - Realizar devolução");
            System.out.println("7 - Verificar a disponibilidade de um livro");
            System.out.println("Qualquer número - sair do sistema");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    registerStudent(students);
                    continue;
                case 2:
                    registerBook(books);
                    continue;
                case 3:
                    findForName(books);
                    continue;
                case 4:
                    findForWriter(books);
                    continue;
                case 5:
                    borrowBook(books);
                    continue;
                case 6:
                    returnBook(books);
                    continue;
                case 7:
                    checkDisponible(books);
                    continue;

                default:
                    System.out.println("Saindo do sistema...");
                    break;
            }

        } while (option > 0 && option < 8);
    }

    public static void registerStudent(Aluno[] students) {
        int register, age;
        String name;

        System.out.println("Digite o nome do aluno:");
        name = sc.next();
        System.out.println("Digite a idade do aluno:");
        age = sc.nextInt();
        System.out.println("Digite o registro acadêmico do aluno:");
        register = sc.nextInt();

        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = new Aluno(name, age, register);
                break;
            }
        }
    }

    public static void registerBook(Livro[] books) {

        String name, writer;

        System.out.println("Digite o nome do livro:");
        name = sc.next();
        System.out.println("Digite o autor do livro:");
        writer = sc.next();
        System.out.println(name + writer);
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = new Livro(name.toLowerCase(), writer.toLowerCase());
                break;
            }
        }
    }

    public static void findForName(Livro[] books) {

        if (books[0] == null) {
            System.out.println("Não há livros registrados");
            return;
        }

        System.out.println("Digite o nome do livro:");
        String name = sc.next().toLowerCase();
        Boolean confirm = false;

        if (books[0] == null) {
            System.out.println("Não há livros cadastrados");
            return;
        }

        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals(name)) {
                System.out.println("Há o livro " + name + " cadastrado em nosso sistema");
                confirm = true;
                break;
            }
        }

        if (!confirm) {
            System.out.println("Não foi encontrado este livro no sistema");
        }
    }

    public static void findForWriter(Livro[] books) {

        if (books[0] == null) {
            System.out.println("Não há livros registrados");
            return;
        }

        System.out.println("Digite o autor do livro:");
        String writer = sc.next().toLowerCase();
        Boolean confirm = false;

        if (books[0] == null) {
            System.out.println("Não há livros cadastrados");
            return;
        }

        for (int i = 0; i < books.length; i++) {
            if (books[i].getWriter().equals(writer)) {
                System.out.println("Há o livro escrito por " + writer + " no sistema");
                System.out.println("Nome do livro: " + books[i].getName());
                confirm = true;
                break;
            }
        }

        if (!confirm) {
            System.out.println("Não foi encontrado algum livro escrito por "
                    + writer + " no sistema");
        }
    }

    public static void borrowBook(Livro[] books) {

        if (books[0] == null) {
            System.out.println("Não há livros registrados");
            return;
        }

        System.out.println("Digite o nome do livro a emprestar");
        String name = sc.next().toLowerCase();

        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals(name)) {

                if (books[i].getDisponible() == false) {
                    System.out.println("Este livro não está disponível");
                    return;
                } else {
                    books[i].setDay();
                    books[i].setDisponible(books[i].getDisponible());
                    System.out.println("Livro emprestado com sucesso");
                    return;
                }
            }
        }

        System.out.println("Livro não encontrado");
    }

    public static void returnBook(Livro[] books) {

        if (books[0] == null) {
            System.out.println("Não há livros registrados");
            return;
        }

        System.out.println("Qual livro deseja devolver?");
        String name = sc.next().toLowerCase();

        Date now = new Date();

        for (int i = 0; i < books.length; i++) {

            if (books[i].getName().equals(name)) {

                if (books[i].getDisponible() == true) {
                    System.out.println("Este livro não foi emprestado");
                    return;
                } else {
                    books[i].setDisponible(false);
                    System.out.println("Livro devolvido com sucesso");

                    if (books[i].getDay().getTime() + (7 * 86400000) > now.getTime()) {
                        Long totalDays = (books[i].getDay().getTime() - now.getTime()) / 86400000;
                        Double totalBill = totalDays * 3.5;
                        System.out.println("Multa: R$" + totalBill);
                    }

                    return;
                }
            }
        }
        System.out.println("Livro não encontrado");
    }

    public static void checkDisponible(Livro[] books) {

        if (books[0] == null) {
            System.out.println("Não há livros registrados");
            return;
        }

        System.out.println("Digite o nome do livro a se verificar");
        String name = sc.next().toLowerCase();

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getName().equals(name)) {
                if (books[i].getDisponible() == true) {
                    System.out.println("Este livro está disponível");
                    return;
                } else {
                    System.out.println("Este livro não está disponível");
                    return;
                }
            }
        }
    }
}
