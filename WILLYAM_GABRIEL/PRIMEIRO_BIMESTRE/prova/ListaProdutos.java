package WILLYAM_GABRIEL.PRIMEIRO_BIMESTRE.prova;

import java.util.List;

public class ListaProdutos {

    private List<Produto> produtos;

    public ListaProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void listarProdutos() {
        System.out.println("\n------ LISTA DE PRODUTOS ------");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
