// 6. Criar uma classe ProcessaPedido com:
// - Método processar, que recebe os dados necessários para criação do pedido.
// - Método privado confirmarPagamento(confirma caso a reserva não esteja vencida, verificar se data atual não é superior a dataVencimentoReserva).
// - Criar teste para verificar método.

import java.util.Date;

public class ProcessaPedido {
    
    Integer sequence = 0;

    public Pedido processar(Item[] itens, String valor){
        Pedido pedido = new Pedido(sequence++, itens);
        return pedido;

    }

    public Pedido confirmarPagamento(Pedido pedido){
        pedido.setDataPagamento(new Date());
        return pedido;

    }
}
