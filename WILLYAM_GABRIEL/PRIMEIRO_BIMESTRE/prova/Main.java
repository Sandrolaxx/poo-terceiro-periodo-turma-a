package WILLYAM_GABRIEL.PRIMEIRO_BIMESTRE.prova;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main gerenciador = new Main();
        gerenciador.menuPrincipal();
    }

    private List<Produto> produtos;
    private Scanner scanner;
    private CadastroProduto cadastroProduto;
    private ListaProdutos listaProdutos;
    private MarcarVendido marcarComoVendido;

    public Main() {
        produtos = new ArrayList<>();
        scanner = new Scanner(System.in);
        cadastroProduto = new CadastroProduto(scanner);
        listaProdutos = new ListaProdutos(produtos);
        marcarComoVendido = new MarcarVendido(produtos, scanner);
    }

    public void menuPrincipal() {
        int opcao;

        do {
            System.out.println("\n------ MENU ------\n");
            System.out.print("OPÇÃO 1 - CADASTRAR PRODUTO\nOPÇÃO 2 - LISTAR PRODUTO\nOPÇÃO 3 - INFORMAR VENDA\nOPÇÃO 4 - SAIR\n\n");

            System.out.print("INFORME A OPÇÃO DESEJADA: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Produto novoProduto = cadastroProduto.cadastrarNovoProduto();
                    produtos.add(novoProduto);
                    System.out.println("PRODUTO CADASTRADO");
                    break;
                case 2:
                    listaProdutos.listarProdutos();
                    break;
                case 3:
                    marcarComoVendido.marcarProdutoComoVendido();
                    break;
                case 4:
                    System.out.println("ENCERRANDO O PROGRAMA");
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA");
            }
        } while (opcao != 4);
    }

}