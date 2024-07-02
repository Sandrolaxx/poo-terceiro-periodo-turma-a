package BARBARA_NYCOLLI.primeirobi.prova;

import java.util.ArrayList;

class Loja {
    private ArrayList<Produto> produtos;

    public Loja() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            System.out.println("Lista de todos os produtos disponíveis:");
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
        }
    }

    public Produto getProdutoById(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null; 
    }
}

