// Criar uma classe ProcessaPedido com:
// - Método processar, que recebe os dados necessários para criação do pedido.
// - Método privado confirmarPagamento(confirma caso a reserva não esteja vencida, 
// verificar se data atual não é superior a dataVencimentoReserva).
// - Criar teste para verificar método.

package exercises.sistemadonagabriela6;

import java.util.Date;

public class ProcessaPedido {
    
    Integer sequence = 0;

    // Métodos

    public Pedido processar(Item[] itens){
        Pedido novoPedido = new Pedido(sequence++, itens);
        return novoPedido;

    }

    public Pedido confirmarPagamento(Pedido pedido){
        pedido.setDataPagamento(new Date());

        if (pedido.getDataPagamento().after(pedido.getDataVencimentoReserva())) {
            System.out.println("\n\t A data atual é superior a data de vencimento.");
        } 

        return pedido;
    }

}