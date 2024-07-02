package WILLYAM_GABRIEL.PRIMEIRO_BIMESTRE.prova;

import java.util.Scanner;

public class CadastroProduto {

    private Scanner scanner;

    public CadastroProduto(Scanner scanner) {
        this.scanner = scanner;
    }

    public Produto cadastrarNovoProduto() {
    
        System.out.println("\n------ CADASTRO DE PRODUTO ------\n");
    
        System.out.print("INFORME O NOME DO PRODUTO: ");
        String nome = scanner.next();
    
        System.out.print("INFORME A DESCRIÇÃO DO PRODUTO: ");
        String descricao = scanner.next();
    
        System.out.print("INFORME O PREÇO DO PRODUTO: ");
        double preco = scanner.nextDouble();
    
        System.out.print("INFORME A QUANTIDADE DO PRODUTO: ");
        int quantidade = scanner.nextInt();
    
        return new Produto(nome, descricao, preco, quantidade);
    }
}
