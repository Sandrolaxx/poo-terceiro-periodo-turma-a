package BARBARA_NYCOLLI.primeirobi.prova;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Loja loja = new Loja();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar o Produto");
            System.out.println("2. Lista de produtos");
            System.out.println("3. Produto vendido!");
            System.out.println("4. Produto não vendido!");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite aqui a ID do produto: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Digite aqui o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite aqui o preço do produto: ");
                    double preco = scanner.nextDouble();
                    Produto produto = new Produto(id, nome, preco);
                    loja.adicionarProduto(produto);
                    System.out.println("Parabéns! Seu produto foi adicionado com sucesso no sistema.");
                    break;
                case 2:
                    loja.listarProdutos();
                    break;
                case 3:
                    System.out.print("Digite o ID do produto vendido: ");
                    int idVendido = scanner.nextInt();
                    Produto produtoVendido = loja.getProdutoById(idVendido);
                    if (produtoVendido != null) {
                        produtoVendido.setVendido(true);
                        System.out.println("Produto marcado como vendido.");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Digite o ID do produto não vendido. ");
                    int idNaoVendido = scanner.nextInt();
                    Produto produtoNaoVendido = loja.getProdutoById(idNaoVendido);
                    if (produtoNaoVendido != null) {
                        produtoNaoVendido.setVendido(false);
                        System.out.println("Produto marcado como não vendido.");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 5:
                    System.out.println("Sessão finalizada.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
