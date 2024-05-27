package ListaSete;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private final int id;
    private final LocalDate dataCriacao;
    private final String parceiro;
    private final Cliente cliente;
    private final List<Item> itens;
    private final LocalDate dataVencimentoReserva; 

    public Pedido(int id, Cliente cliente, String parceiro, LocalDate dataVencimentoReserva) {
        this.id = id;
        this.cliente = cliente;
        this.parceiro = parceiro;
        this.dataCriacao = LocalDate.now();
        this.itens = new ArrayList<>();
        this.dataVencimentoReserva = dataVencimentoReserva; 
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public double calcularValorTotal() {
        return itens.stream().mapToDouble(Item::getValor).sum();
    }

    public String gerarDescricaoVenda() {
        StringBuilder descricao = new StringBuilder();
        descricao.append("Descrição do Pedido:\n");
        descricao.append("ID do Pedido: ").append(id).append("\n");
        descricao.append("Data de Criação: ").append(dataCriacao).append("\n");
        descricao.append("Parceiro: ").append(parceiro).append("\n");
        descricao.append("Cliente: ").append(cliente.getNome()).append("\n");
        descricao.append("Itens do Pedido:\n");
        for (Item item : itens) {
            descricao.append("- ").append(item.getNome()).append(": R$ ").append(item.getValor()).append("\n");
        }
        descricao.append("Valor Total: R$ ").append(calcularValorTotal()).append("\n");
        return descricao.toString();
    }

    public LocalDate getDataVencimentoReserva() {
        return dataVencimentoReserva;
    }
}
