package MATHEUS_HENRIQUE_SIMONETTO.primeirobi.prova;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibrarySystem librarySystem = new LibrarySystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nBiblioteca FAG - Menu Principal");
            System.out.println("1. Adicionar aluno");
            System.out.println("2. Adicionar livro");
            System.out.println("3. Buscar livro por título");
            System.out.println("4. Buscar livro por autor");
            System.out.println("5. Realizar empréstimo");
            System.out.println("6. Realizar devolução");
            System.out.println("7. Calcular multa");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addStudent(librarySystem, scanner);
                    break;
                case 2:
                    addBook(librarySystem, scanner);
                    break;
                case 3:
                    searchBookByTitle(librarySystem, scanner);
                    break;
                case 4:
                    searchBookByAuthor(librarySystem, scanner);
                    break;
                case 5:
                    borrowBook(librarySystem, scanner);
                    break;
                case 6:
                    returnBook(librarySystem, scanner);
                    break;
                case 7:
                    calculateFine(scanner);
                    break;
                case 8:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void addStudent(LibrarySystem librarySystem, Scanner scanner) {
        System.out.print("Digite o ID do aluno: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o nome do aluno: ");
        String name = scanner.nextLine();
        System.out.print("Digite o email do aluno: ");
        String email = scanner.nextLine();

        Student student = new Student(id, name, email);
        librarySystem.addStudent(student);
        System.out.println("Aluno adicionado com sucesso!");
    }

    private static void addBook(LibrarySystem librarySystem, Scanner scanner) {
        System.out.print("Digite o ID do livro: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o título do livro: ");
        String title = scanner.nextLine();
        System.out.print("Digite o autor do livro: ");
        String author = scanner.nextLine();

        Book book = new Book(id, title, author, true);
        librarySystem.addBook(book);
        System.out.println("Livro adicionado com sucesso!");
    }

    private static void searchBookByTitle(LibrarySystem librarySystem, Scanner scanner) {
        System.out.print("Digite o título do livro para busca: ");
        String title = scanner.nextLine();
        Book book = librarySystem.searchByTitle(title);
        if (book != null) {
            System.out.println("Livro encontrado: " + book.getTitle() + " por " + book.getAuthor());
        } else {
            System.out.println("Livro não encontrado ou não está disponível.");
        }
    }

    private static void searchBookByAuthor(LibrarySystem librarySystem, Scanner scanner) {
        System.out.print("Digite o autor do livro para busca: ");
        String author = scanner.nextLine();
        Book book = librarySystem.searchByAuthor(author);
        if (book != null) {
            System.out.println("Livro encontrado: " + book.getTitle() + " por " + book.getAuthor());
        } else {
            System.out.println("Livro não encontrado ou não está disponível.");
        }
    }

    private static void borrowBook(LibrarySystem librarySystem, Scanner scanner) {
        System.out.print("Digite o ID do livro para empréstimo: ");
        int bookId = scanner.nextInt();
        System.out.print("Digite o ID do aluno que está pegando emprestado: ");
        int studentId = scanner.nextInt();
        librarySystem.borrowBook(bookId, studentId);
        System.out.println("Empréstimo realizado.");
    }

    private static void returnBook(LibrarySystem librarySystem, Scanner scanner) {
        System.out.print("Digite o ID do livro para devolução: ");
        int bookId = scanner.nextInt();
        librarySystem.returnBook(bookId);
        System.out.println("Devolução realizada.");
    }

    private static void calculateFine(Scanner scanner) {
        System.out.print("Digite o número de dias de atraso: ");
        int days = scanner.nextInt();
        double fine = days > 7 ? (days - 7) * 3.50 : 0;
        System.out.println("Multa total: R$ " + fine);
    }
}
