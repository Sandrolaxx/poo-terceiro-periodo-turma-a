package primeirobi.aulasete;

import java.util.Date;
import java.util.List;

import primeirobi.Cliente;
import primeirobi.Loja;
import primeirobi.Vendedor;
import primeirobi.aulaseis.Item;
import primeirobi.aulaseis.Pedido;

public class processaPedidoNovo {
    public boolean processar(int idPedido, Date dataCriacao, Cliente cliente, Vendedor vendedor, Loja loja, List<Item> itens) {
        Pedido pedido = new Pedido(idPedido, dataCriacao, cliente, vendedor, loja, itens);
        
        boolean pagamentoConfirmado = confirmarPagamento(pedido);
        
        if (pagamentoConfirmado) {
            System.out.println("PEDIDO PROCESSADO COM SUCESSO!");
            apresentarPedido(pedido);
            return true;
        } else {
            System.out.println("NAO FOI POSSIVEL PROCESSAR O PEDIDO DEVIDO A RESERVA VENCIDA.");
            return false;
        }
    }

    private boolean confirmarPagamento(Pedido pedido) {
        
        return true; 
    }

    private void apresentarPedido(Pedido pedido) {
        System.out.println("PEDIDO ID: " + pedido.getIdPedido());
        System.out.println("DATA DE CRIACAO: " + pedido.getDataCriacao());
        System.out.println("CLIENTE: " + pedido.getClass().getName());
        System.out.println("VENDEDOR: " + pedido.getVendedor().getNome());
        System.out.println("LOJA: " + pedido.getLoja().getNome());
        System.out.println("ITENS DO PEDIDO:");
        for (Item item : pedido.getItens()) {
            System.out.println(); 
        }
        System.out.println("VALOR TOTAL DO PEDIDO: " + pedido.calcularValorTotal());
    }

    public static void main(String[] args) {
        processaPedidoNovo processador = new processaPedidoNovo();
        
        List<Item> itensSelecionados = List.of(
            new Item(1, "Produto 1", "Tipo 1", 100.0),
            new Item(2, "Produto 2", "Tipo 2", 150.0)
        );
        
        int idPedido = 1;
        Date dataCriacao = new Date();
        Cliente cliente = new Cliente("Jeff");
        Vendedor vendedor = new Vendedor("Altair");
        Loja loja = new Loja("Myy Plant", null, null, null, null, null);
        
        boolean pedidoProcessado = processador.processar(idPedido, dataCriacao, cliente, vendedor, loja, itensSelecionados);
        if (pedidoProcessado) {
            System.out.println("PEDIDO CONCLUIDO!");
        } else {
            System.out.println("FALHA AO PROCESSAR PEDIDO.");
        }
    }
}
