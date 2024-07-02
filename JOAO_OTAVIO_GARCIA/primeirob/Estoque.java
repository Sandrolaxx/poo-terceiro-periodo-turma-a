package JOAO_OTAVIO_GARCIA.primeirob;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<Produto> produtos = new ArrayList<>();

    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void imprimir() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }

    }
}
