package primbi.ListaLista07;

import java.util.Date;
import java.util.List;

public class ProcessaPedido extends Pedido {

    public ProcessaPedido(int id, Date dataCriacao, Cliente cliente, Funcionario vendedor, List<Item> itens, String nomeLoja) {
        super(id, dataCriacao, cliente, vendedor, itens, nomeLoja);
    }
    public void processar() {
        confirmarPagamento();
    }

    private void confirmarPagamento() {
        long millisInDay = 1000 * 60 * 60 * 24;
        Date dataVencimentoReserva = new Date(getDataCriacao().getTime() + 3 * millisInDay);
        Date dataAtual = new Date();
        if (!dataAtual.after(dataVencimentoReserva)) {
            System.out.println("Pagamento confirmado" + getId());
        } else {
            System.out.println("Reserva vencida " + getId() + ". Pagamento não confirmado.");
        }
    }

}
