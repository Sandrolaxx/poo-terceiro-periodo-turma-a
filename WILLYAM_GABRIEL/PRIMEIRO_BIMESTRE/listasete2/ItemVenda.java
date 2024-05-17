package ListaSete;

public class ItemVenda extends Objeto {
    
    Item item;
    int quantidade;

    protected ItemVenda(int id, Item item, int quantidade) {
        super(id);
        this.item = item;
        this.quantidade = quantidade;
    }

    protected double getValor() {
        return item.valor * quantidade;
    }
}
