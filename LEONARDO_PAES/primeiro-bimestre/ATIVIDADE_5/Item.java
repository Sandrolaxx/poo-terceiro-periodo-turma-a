package ATIVIDADE_5;

public class Item {

    int id;
    String nome;
    String tipo;
    double valor;

    public Item(int id, String nome, String tipo, double valor) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
    }

    public void geraDescricao() {

        System.out.println("Id: " + id + " Nome: " + nome + " Tipo: " + tipo + " Valor: " + valor);

    }

    public double getValor() {
        return valor;
    }

}
