package atividades1B;
import java.util.Scanner;

public class Main {
    static Item[] itensDisponiveis = {
        new Item(1, "Vaso de Flores", "Decoração", 50.0),
        new Item(2, "Fertilizante Orgânico", "Jardinagem", 20.0),
        new Item(3, "Vasos Decorativos", "Decoração", 30.0),
        new Item(4, "Terra Vegetal", "Jardinagem", 15.0),
        new Item(5, "Regador", "Jardinagem", 25.0),
        new Item(6, "Adubo para Flores", "Jardinagem", 18.0)
    };

    public static void main(String[] args) {
    }

    public static void cadastrarItens() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("### Cadastro de Itens ###");
        System.out.print("Digite o nome do item: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a categoria do item: ");
        String categoria = scanner.nextLine();
        System.out.print("Digite o preço do item: ");
        double preco = scanner.nextDouble();

        int proximoId = itensDisponiveis[itensDisponiveis.length - 1].getId() + 1;

        Item novoItem = new Item(proximoId, nome, categoria, preco);
        Item[] novaLista = new Item[itensDisponiveis.length + 1];
        for (int i = 0; i < itensDisponiveis.length; i++) {
            novaLista[i] = itensDisponiveis[i];
        }
        novaLista[itensDisponiveis.length] = novoItem;
        itensDisponiveis = novaLista;

        System.out.println("Item cadastrado com sucesso!");
        scanner.close();
    }

    public static void listarItens() {
        System.out.println("### Lista de Itens Disponíveis ###");
        for (Item item : itensDisponiveis) {
            System.out.println(item);
        }
    }
}
