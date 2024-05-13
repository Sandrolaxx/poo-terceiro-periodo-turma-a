package primeirobi.atividades.sysLista7;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Item> itens = new ArrayList<>();
    private String parceria;

    public Pedido(String parceria) {
        this.parceria = parceria;
    }

    public void addItem(Item item) {
        itens.add(item);
    }

    public double calcularTotal() {
        return itens.stream().mapToDouble(Item::getPreco).sum();
    }

    public void displayPedido() {
        System.out.println("Pedido em parceria com " + parceria);
        itens.forEach(Item::display);
        System.out.printf("Total do Pedido: %.2f\n", calcularTotal());
    }
}
