
import java.util.ArrayList;
import java.util.Date;



public class Pedido {
    private final int id;
    private final Date dataCriacao;
    private final String parceiro;
    private final ArrayList<Item> itens;

    public Pedido(int id, Cliente cliente, String parceiro) {
        this.id = id;
        this.parceiro = parceiro;
        this.dataCriacao = new Date();
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public double calcularValorTotal() {
        return itens.stream().mapToDouble(Item::getValor).sum();
    }

    public void gerarDescricaoVenda() {
        System.out.printf("Pedido #%d criado em: %s, Parceiro: %s, Valor Total: %.2f\n", id, dataCriacao, parceiro, calcularValorTotal());
    }

    public Date getDataVencimentoReserva() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDataVencimentoReserva'");
    }
}
