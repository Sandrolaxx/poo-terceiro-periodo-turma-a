
package primeirobi.aulaseis;
import java.util.Date;
import java.util.List;

import primeirobi.Cliente;
import primeirobi.Loja;
import primeirobi.Vendedor;

public class processaPedido {
    public void processar(int idPedido, Date dataCriacao, Cliente cliente, Vendedor vendedor, Loja loja, List<Item> itens) {
        Pedido pedido = new Pedido(idPedido, dataCriacao, cliente, vendedor, loja, itens);
        boolean pagamentoConfirmado = confirmarPagamento(pedido);
        if (pagamentoConfirmado) {
            System.out.println("PEDIDO PROCESSADO COM SUCESSO!");
        } else {
            System.out.println("NAO FOI POSSIVEL PROCESSAR O PEDIDO DEVIDO A RESERVA VENCIDA.");
        }
    }

    private boolean confirmarPagamento(Pedido pedido) {
        Date dataAtual = new Date();
        if (dataAtual.before(pedido.calcularDataVencimentoReserva())) {
            
            pedido.setDataPagamento(dataAtual);
            return true;
        } else {
            return false;
        }
    }

    public void apresentarSe(int idPedido, Date dataCriacao, Cliente cliente, Vendedor vendedor, Loja loja, List<Item> itens) {
        Pedido pedido = new Pedido(idPedido, dataCriacao, cliente, vendedor, loja, itens);
        System.out.println("PEDIDO ID: " + idPedido);
        System.out.println("DATA DE CRIACAO: " + dataCriacao);
        System.out.println("CLIENTE: " + cliente.getNome());
        System.out.println("VENDEDOR: " + vendedor.getNome());
        System.out.println("LOJA: " + loja.getNome());
        System.out.println("ITENS DO PEDIDO:");
        for (Item item : itens) {
            item.gerarDescricao();
        }
        System.out.println("VALOR TORAL DO PEDIDO: " + pedido.calcularValorTotal());
    }

    public static void main(String[] args) {
       
        Date dataCriacao = new Date(System.currentTimeMillis() - 2 * 24 * 60 * 60 * 1000);
        Cliente cliente = new Cliente("Jeff");
        Vendedor vendedor = new Vendedor("Altair");
        Loja loja = new Loja("myy Plant", null, null, null, null, null);
        Item[] itens = {new Item(1, "Produto 1", "Tipo 1", 100.0)};
        processaPedido processador = new processaPedido();
        processador.apresentarSe(1, dataCriacao, cliente, vendedor, loja, itens);

        Date dataCriacao2 = new Date(System.currentTimeMillis() - 4 * 24 * 60 * 60 * 1000);
        processaPedido processador2 = new processaPedido();
        processador2.apresentarSe(2, dataCriacao2, cliente, vendedor, loja, itens);
    }

    private void apresentarSe(int idPedido, Date dataCriacao, Cliente cliente, Vendedor vendedor, Loja loja,
            Item[] itens) {
    }
}
