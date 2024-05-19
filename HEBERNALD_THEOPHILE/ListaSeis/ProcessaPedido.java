package ListaSeis;
import java.util.Date;

public class ProcessaPedido {
    public void processar(int idPedido, Date dataCriacao, Cliente cliente, Vendedor vendedor, String loja, Item[] itens) {
        Pedido pedido = new Pedido(idPedido, dataCriacao, cliente, vendedor, loja, itens);
       
    }

    private boolean confirmarPagamento(Date dataAtual, Date dataVencimentoReserva) {
        return !dataAtual.after(dataVencimentoReserva);
    }
}
