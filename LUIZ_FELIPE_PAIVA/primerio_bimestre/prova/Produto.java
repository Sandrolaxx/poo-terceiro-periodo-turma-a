package LUIZ_FELIPE_PAIVA.primerio_bimestre.prova;

public class Produto {
    private String nome;
    private int id;
    private String descricao;
    private int quantidade;
    private double preco;
    private boolean status = true;

    public Produto(String nome, int id, String descricao, int quantidade, double preco) {
        this.nome = nome;
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public int getQuantidade() {
        return quantidade;
    }


    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    public double getPreco() {
        return preco;
    }


    public void setPreco(double preco) {
        this.preco = preco;
    }


    public boolean isStatus() {
        return status;
    }


    public void setStatus(boolean status) {
        this.status = status;
    }


    public void realizarVenda() {
        this.status = false;
    }
    

    @Override
    public String toString() {
        String verificarStatus = status ? "Disponível" : "Vendido";
        String dados = ("Produto:" + nome + "\nID: " + id + "\nDescricao: " + descricao + "\nQuantidade: " + quantidade + "\nPreço: R$ " + preco + "\nStatus: " + verificarStatus);
        System.out.println();
        return dados;
        
    }
}