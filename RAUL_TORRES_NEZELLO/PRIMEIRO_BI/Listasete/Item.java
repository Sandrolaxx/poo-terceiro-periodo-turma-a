package PRIMEIRO_BI.Listasete;

public class Item {
    private int id;
    private String nome;
    private String tipo;
    private double valor;

    public Item(int id, String nome, String tipo, double valor){
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
    }
    public void apresentarDescricao(){
        System.out.println("Id: "+id+"\nNome: "+nome+"\nTipo: "+tipo+"\nValor: "+valor);
    }
    public double getPreco() {
        return valor;
    }
    public int getId(){
        return id;
    }
}
