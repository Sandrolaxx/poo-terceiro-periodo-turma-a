package Lista06;

import java.util.Date;
import java.util.List;

import SistemaMyyPlant.Cliente;
import SistemaMyyPlant.Vendedor;

public class Pedido {
     private int id;
    private Date dataCriacao;
    public Pedido(int id, Date dataCriacao, Cliente cliente, Vendedor vendedor, String loja, List<Item> itens) {
        this.id = id;
        this.dataCriacao = dataCriacao;
        calcularDataVencimentoReserva();
    }

    private Date calcularDataVencimentoReserva() {
        return dataCriacao;

    }

    public double calcularValorTotal() {
        return id;
    }

    public void gerarDescricaoVenda() {
    }
}
