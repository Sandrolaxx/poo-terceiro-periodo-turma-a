package primeirobi.atividades.lista6;

public class Item {
    private int id;
    private String nome, tipo;
    private double valor;

    public Item(int id, String nome, String tipo, double valor) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
    }

    public void gerarDescricao() {
        System.out.println("ID: " + id + "\nNome: " + nome + "\nTipo: " + tipo + "\nValor: " + valor);
    }

    public double getValor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getValor'");
    }
}
