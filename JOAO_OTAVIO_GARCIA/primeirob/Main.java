package JOAO_OTAVIO_GARCIA.primeirob;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();

        while (true) {
            System.out.println("\n|MENU:\n|[1] Cadastro de itens\n|[2] Historico de itens\n|[3]Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nID do produto:");
                    int idProduto = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nome do produto:");
                    String nomeProduto = scanner.nextLine();
                    System.out.println("descrição do produto:");
                    String discriProduto = scanner.nextLine();
                    System.out.println("Valor do produto:");
                    double valorProduto = scanner.nextDouble();
                    System.out.println("Quantidade do produto:");
                    int quantProduto = scanner.nextInt();
                    estoque.cadastrarProduto(
                            new Produto(idProduto, nomeProduto, quantProduto, discriProduto, valorProduto, false));
                    break;

                case 2:
                    System.out.println("\nEstoque:\n");
                    estoque.imprimir();
                    break;
                case 3:
                    System.out.println("saindo do sistema");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;

            }
        }
    }
}
