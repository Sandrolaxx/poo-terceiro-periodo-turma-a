


public class Item {
    private final int id;
    private final String nome;
    private final String tipo;
    private final double valor;

    public Item(int id, String nome, String tipo, double valor) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
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

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Nome: %s, Tipo: %s, Valor: %.2f", id, nome, tipo, valor);
    }
}
