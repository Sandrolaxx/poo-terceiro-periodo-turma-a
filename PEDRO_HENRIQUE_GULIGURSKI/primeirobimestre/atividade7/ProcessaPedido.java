package primeirobimestre.atividade7;

import java.util.Date;
import java.util.List;

public class ProcessaPedido{
    
    private int idPedido = 1;
    public Pedido processar(Cliente cliente, Vendedor vendedor, Loja loja,List<Item> itens){
        Pedido pedido = new Pedido(idPedido, cliente, vendedor, loja, itens);
        idPedido++;
        System.out.println(pedido.gerarDescricaoVenda());
        return pedido;
    }

    @SuppressWarnings("unused")
    private Pedido confirmarPagamento(Pedido pedido){
        Date dataPagamento = pedido.setDataPagamento();
        Date dataVencimento = pedido.getDataVencimentoReserva();

        if (dataPagamento.getTime() <= dataVencimento.getTime()){
            return pedido;
        } else {
            System.out.println("Data da reserva expirada.");
            return pedido;
        }
    }
}
