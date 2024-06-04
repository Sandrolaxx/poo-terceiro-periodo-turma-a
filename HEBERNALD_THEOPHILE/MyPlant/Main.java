package MyPlant;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("João", 30, "São Paulo", "Centro", "Rua A");

        
        Vendedor vendedor = new Vendedor("Maria", 25, "Myy Plant", "São Paulo", "Centro", "Rua B", 2000);

        
        Item[] itens = {
            new Item(1, "Planta", "Decoração", 50.0),
            new Item(2, "Vaso", "Decoração", 30.0)
        };

        
        Pedido pedido = new Pedido(1, new Date(), cliente, vendedor, "My Plant", itens);

        
        ProcessaPedido processador = new ProcessaPedido();

        
        processador.processar(pedido.getId(), pedido.getDataCriacao(), cliente, vendedor, pedido.getLoja(), itens);
    }
}
