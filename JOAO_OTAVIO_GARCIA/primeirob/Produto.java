package JOAO_OTAVIO_GARCIA.primeirob;

public class Produto {

    private int id;
    private String nome;
    private int quant;
    private String disc;
    private double valor;
    private boolean status;

    public Produto(int id, String nome, int quant, String disc, double valor, boolean status) {
        this.id = id;
        this.nome = nome;
        this.quant = quant;
        this.disc = disc;
        this.valor = valor;
        this.status = status;
    }

    public String getDisc() {
        return disc;
    }

    public boolean isStatus() {
        return status;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getQuant() {
        return quant;
    }

    public double getValor() {
        return valor;
    }

    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Quantidade: " + quant + ", Valor: " + valor + ", Vendido " + status
                + ", descrição do produto:" + disc;
    }
}
