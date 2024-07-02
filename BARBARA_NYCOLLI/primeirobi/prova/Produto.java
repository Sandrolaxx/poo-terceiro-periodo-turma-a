package BARBARA_NYCOLLI.primeirobi.prova;

class Produto {
    private int id;
    private String nome;
    private double preco;
    private boolean vendido;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.vendido = false; 
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Preço: " + preco + ", Vendido: " + (vendido ? "Sim" : "Não");
    }
}