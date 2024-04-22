package ListaSeis;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Pedido {
     int id;
    private Date dataCriacao;
     Date dataVencimentoReserva;
    private Cliente cliente;
    private Vendedor vendedor;
     Loja loja;
    private ArrayList<Item> itens;

    public Pedido(int id, Date dataCriacao, Cliente cliente, Vendedor vendedor, Loja loja){
        long tresDiasMillis = TimeUnit.DAYS.toMillis(3);
        this.id = id;
        this.dataCriacao = dataCriacao;
        this.dataVencimentoReserva = new Date(dataCriacao.getTime() + (3 * 24 * 60 * 60 * 1000));
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.loja = loja;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public double calcularValorTotal() {
        double total = 0.0;
        for (Item item : itens) {
            total += item.getValor();
        }
        return total;
    }

    public void gerarDescricaoVenda(){
        System.out.println("================================================");
        System.out.println("DATA DE CRIAÇÃO DO PEDIDO: " + dataCriacao);
        System.out.println("CLIENTE: " + cliente.getNome());
        System.out.println("VENDEDOR: " + vendedor.getNome());
        System.out.println("ITENS DO PEDIDO:");
        for (Item item : itens) {System.out.println("- " + item.getNomeItem() + " | Valor: R$" + item.getValor());
        }
        System.out.println("VALOR TOTAL DO PEDIDO: R$" + calcularValorTotal());
        System.out.println("================================================");
    }
}
