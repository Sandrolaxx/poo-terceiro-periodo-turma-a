package listasete2;

import java.util.Date;

public class ProcessaPedido {
    private Loja loja;

    protected ProcessaPedido(Loja loja) {
        this.loja = loja;
    }

    protected void processar(Cliente cliente, Pedido pedido) {
        loja.adicionarPedido(pedido);

        System.out.println("\n-------------------------------------------------------------------------------------");
        System.out.println("PROCESSO DO PEDIDO DO CLIENTE "+ cliente.getNome() +" FOI REALIZADO COM SUCESSO");
        System.out.println("-------------------------------------------------------------------------------------");

    }

    protected boolean confirmarPagamento(Pedido pedido) {
        Date dataAtual = new Date();
        return !dataAtual.after(pedido.getDataVencimentoReserva());
    }
}
