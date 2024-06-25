package primeirobi.ListasExc.Lista2_2BIM;

public class Produto {
    private double precoProd;
    private String nomeProd;
    

    public Produto(String nomeProd, double precoProd) {
        this.precoProd = precoProd;
        this.nomeProd = nomeProd;
    }

    public double getPreco() {
        return precoProd;
    }

    public String getNome() {
        return nomeProd;
    }
}
