package primeirobi.atividades.sysLista6;

public class Item {
    private int id;
    private String nome;
    private String tipo;
    private double valor;

    public Item(int id, String nome, String tipo, double valor) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
    }

    public void gerarDescricao() {
        System.out.println("ID: " + id + ", Nome: " + nome + ", Tipo: " + tipo + ", Valor: R$" + valor);
    }

    public double getValor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getValor'");
    }
}
