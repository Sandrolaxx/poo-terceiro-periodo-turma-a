package primeirobi.atividades.myplant;

import java.util.ArrayList;
import java.util.Date;

import primeirobi.atividades.myyplant.Cliente;
import primeirobi.atividades.myyplant.Vendedor;

public class Menu {
    public static void main(String[] args) {
        // Dados de teste
        ArrayList<Item> itens = new ArrayList<>();
        itens.add(new Item(1, "Produto 1", "Tipo 1", 50.0));
        itens.add(new Item(2, "Produto 2", "Tipo 2", 75.0));

        Cliente cliente = new Cliente("Cliente Teste", 0, "123456789", null, null);
        Vendedor vendedor = new Vendedor("Vendedor Teste", 0, "Loja Teste", null, null, null, 0);

        Date dataCriacao = new Date(); // Data atual

        // Processamento do pedido
        ProcessaPedido processador = new ProcessaPedido();
        processador.processar(1, dataCriacao, cliente, vendedor, "Loja Teste", itens);
    }
}
