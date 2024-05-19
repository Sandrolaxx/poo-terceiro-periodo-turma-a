package primeirobi.lists.Lista6;

public class Item {
    String id, nome, tipo;
    double valor;

    public Item(String nome, String tipo, String id, double valor) {
        this.nome = nome;
        this.tipo = tipo;
        this.id = id;
        this.valor = valor;
    }

    void gerarDescricao() {
        System.out.println(nome + ", " + tipo + ", " + id + ", " + valor);
    }
}