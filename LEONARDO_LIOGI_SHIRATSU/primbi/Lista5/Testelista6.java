package primbi.Lista5;

import java.util.Date;

public class Testelista6 {
    public static void main(String[] args) {
        Gerente6 gerente = new Gerente6("João", 35, "Loja 1", 2000, "SP", "São Paulo", "Centro", 100, "Bloco A");
        Item item1 = new Item(1, "Camiseta", "Vestuário", 50.0);
        Item item2 = new Item(2, "Calça", "Vestuário", 80.0);
        Item item3 = new Item(3, "Tênis", "Calçado", 120.0);
        Item[] itensPedido = { item1, item2, item3 };

        System.out.println("Dados do Gerente:");
        gerente.apresentarSe();
        gerente.calcularMedia();
        gerente.calcularBonus();

        System.out.println("\nItens do Pedido:");
        for (Item item : itensPedido) {
            item.gerarDescricao();
        }

        Date dataCriacao = new Date();
        ProcessaPedido processador = new ProcessaPedido(1, dataCriacao, null, null, null, itensPedido);
        processador.processarPedido();
    }
}