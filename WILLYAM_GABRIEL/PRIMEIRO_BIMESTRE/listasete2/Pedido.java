package listasete2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Pedido extends Objeto {
    protected Cliente cliente;
    protected Date dataCriacao;
    protected Date dataPagamento;
    protected Date dataVencimentoReserva;
    protected List<ItemVenda> vendas;

    protected Pedido(int id, Cliente cliente) {
        super(id);
        this.cliente = cliente;
        this.dataCriacao = new Date();
        this.dataVencimentoReserva = calcularDataVencimentoReserva();
        this.vendas = new ArrayList<>();
    }

    protected double calcularValorTotal() {
        double total = 0;
        
        for (ItemVenda itemVenda : vendas) {
            total += itemVenda.getValor();
        }
        return total;
    }

    protected void adicionarItens(List<ItemVenda> itensVendidos) {
        vendas = itensVendidos;
    }
    
    protected Date getDataVencimentoReserva() {
        return dataVencimentoReserva;
    }

    protected void gerarDescricaoVenda() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        System.out.println("\n-------------------------------------------------------------------------------------");
        System.out.println("DATA DE CRIAÇÃO DO PEDIDO: " + dateFormat.format(dataCriacao));
        System.out.println("DATA DE VENCIMENTO DA RESERVA: " + dateFormat.format(dataVencimentoReserva));
        System.out.println("-------------------------------------------------------------------------------------");


    }

    protected Date calcularDataVencimentoReserva() {
        long tresDiasMillis = TimeUnit.DAYS.toMillis(3);
        return new Date(dataCriacao.getTime() + tresDiasMillis);
    }
}
