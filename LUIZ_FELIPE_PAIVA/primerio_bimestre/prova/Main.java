package LUIZ_FELIPE_PAIVA.primerio_bimestre.prova;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        int opcao;

        do {
            System.out.println("Escolhe uma das opções");
            System.out.println("1 - Cadastrar novo produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Marcar como vendido");
            System.out.println("4 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do produto");
                    scanner.nextLine();
                    String nome = scanner.nextLine();
                    System.out.println("Digite o ID do produto");
                    int id = scanner.nextInt();
                    System.out.println("Digite a descrição do produto");
                    scanner.nextLine();
                    String descricao = scanner.nextLine();
                    System.out.println("Digite a quantidade do produto");
                    int quantidade = scanner.nextInt();
                    System.out.println("Digite o preço do produto");
                    double preco = scanner.nextDouble();
                    Produto produto = new Produto(nome, id, descricao, quantidade, preco);
                    produtos.add(produto);
                    System.out.println("Produto registrado \n");
                    break;

                case 2:
                    for (Produto p : produtos) {
                        System.out.println(p);
                    }
                    break;

                case 3:
                    System.out.println("Digite o ID do produto a ser vendido");
                    int produtoVendido = scanner.nextInt();
                    boolean produtoEstoque = false;
                    for (Produto p : produtos) {
                        if (p.getId() == produtoVendido) {
                            p.realizarVenda();
                            System.out.println("Produto vendido");
                            produtoEstoque = true;
                            break;
                        }
                    }
                    if (!produtoEstoque) {
                        System.out.println("Produto nao foi encontrado");
                    }
                    break;

                case 4:
                    System.out.println("Encerrando");
                    break;

                default:
                    System.out.println("Erro");
                    break;
            }

        } while (opcao != 4);

        scanner.close();
    }
}