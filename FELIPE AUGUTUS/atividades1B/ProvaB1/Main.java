package ProvaB1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
CadastroLivros cadastroLivros = new CadastroLivros();
Emprestimo emprestimo = new Emprestimo(cadastroLivros);
Devolucao devolucao = new Devolucao(cadastroLivros);

Biblioteca biblioteca = new Biblioteca(cadastroLivros, emprestimo, devolucao);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    biblioteca.procurarPorTitulo(scanner);
                    break;
                case 2:
                    biblioteca.procurarPorAutor(scanner);
                    break;
                case 3:
                    biblioteca.realizarEmprestimo(scanner);
                    break;
                case 4:
                    biblioteca.realizarDevolucao(scanner);
                    break;
                case 5:
                    // Adicione aqui a chamada para o método verificarDisponibilidadePorTitulo(scanner)
                    break;
                case 6:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Procurar por título");
        System.out.println("2 - Procurar por autor");
        System.out.println("3 - Realizar empréstimo");
        System.out.println("4 - Realizar devolução");
        System.out.println("5 - Verificar disponibilidade de empréstimo por título");
        System.out.println("6 - Sair");
    }
}
