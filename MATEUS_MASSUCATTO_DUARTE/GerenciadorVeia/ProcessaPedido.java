package GerenciadorVeia;
import java.util.Date;

public class ProcessaPedido 
{
    public void processar(Pedido pedido)
    {
        confirmarPagamento(pedido);
    }

    private void confirmarPagamento(Pedido pedido)
    {
        Date dataAtual = new Date();
        if (pedido.dataVencimentoReserva.after(dataAtual))
        {
            System.out.println("Pagamento confirmado para o pedido " + pedido.id);
        } 
        else
        {
            System.out.println("Reserva do pedido: " + pedido.id + " vencida");
        }
    }
}
