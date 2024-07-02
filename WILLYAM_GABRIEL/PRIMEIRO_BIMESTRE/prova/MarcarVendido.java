package WILLYAM_GABRIEL.PRIMEIRO_BIMESTRE.prova;

import java.util.List;
import java.util.Scanner;

public class MarcarVendido {

    private List<Produto> produtos;
    private Scanner scanner;

    public MarcarVendido(List<Produto> produtos, Scanner scanner) {
        this.produtos = produtos;
        this.scanner = scanner;
    }

    public void marcarProdutoComoVendido() {
        System.out.print("INFORME O ID DO PRODUTO VENDIDO: ");
        int id = scanner.nextInt();

        boolean encontrado = false;
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                System.out.print("INFORME A QUANTIDADE VENDIDA: ");
                int quantidade = scanner.nextInt();

                produto.vender(quantidade);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("PRODUTO NÃO LOCALIZADO, INFORME O ID CORRETAMENTE");
        }
    }
}
