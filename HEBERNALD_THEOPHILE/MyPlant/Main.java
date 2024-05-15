package MyPlant;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criando um cliente
        Cliente cliente = new Cliente("João", 30, "São Paulo", "Centro", "Rua A");

        // Criando um vendedor
        Vendedor vendedor = new Vendedor("Maria", 25, "Myy Plant", "São Paulo", "Centro", "Rua B", 2000);

        // Criando itens
        Item[] itens = {
            new Item(1, "Planta", "Decoração", 50.0),
            new Item(2, "Vaso", "Decoração", 30.0)
        };

        // Criando um pedido
        Pedido pedido = new Pedido(1, new Date(), cliente, vendedor, "My Plant", itens);

        // Criando um processador de pedidos
        ProcessaPedido processador = new ProcessaPedido();

        // Processando o pedido
        processador.processar(pedido.getId(), pedido.getDataCriacao(), cliente, vendedor, pedido.getLoja(), itens);
    }
}
