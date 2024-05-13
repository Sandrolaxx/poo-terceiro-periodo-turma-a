package Lista06;

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

    public void gerarDescricao() {
        System.out.println("ID: " + id + ", Nome: " + nome + ", Tipo: " + tipo + ", Preço: " + preco);
    }
}
