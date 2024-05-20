package primeirobi.ListasExc.Lista6Nova;

import java.util.Date;
import java.util.Scanner;


public class CriarPedidos {
     Scanner scanner;

    public CriarPedidos(Scanner scanner) {
        this.scanner = scanner;
    }

    public void criarPedido(int idPedido, Cliente cliente, Vendedor vendedor, Loja loja) {
        Date dataCriacao = new Date(); 
        Date dataVencimentoReserva = new Date(); 

        
        Pedido pedido = new Pedido(idPedido, null, dataCriacao, null, dataVencimentoReserva, cliente, vendedor, loja);

        
        ProcessaPedido processador = new ProcessaPedido();
        processador.processar(pedido.getId(), dataCriacao, pedido.getDataPagamento(), pedido.getDataVencimentoReserva(), pedido.getCliente(), pedido.getVendedor(), pedido.getLoja());

        System.out.println("Pedido criado com sucesso!");
    }
}
