package primeirobimestre.SetimaLista;
import java.util.Date;

public class ProcessaPedido {
    Integer sequence = 0;

    public Pedido processa(Item[] items, String valor) {
        Pedido pedido = new Pedido(sequence++, items);

        return pedido;
    }

    public Pedido confirmarPagamento(Pedido pedido) {
        pedido.setDataPagamento(new Date());

        return pedido;
    }
}
