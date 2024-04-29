package primeirobi.atividades.sysLista7;

public class Item {
    private int id;
    private String nome;
    private String tipo;
    private double preco;

    public Item(int id, String nome, String tipo, double preco) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void display() {
        System.out.printf("ID: %d, Nome: %s, Tipo: %s, Preço: %.2f\n", id, nome, tipo, preco);
    }
}
