package WILLYAM_GABRIEL.PRIMEIRO_BIMESTRE.prova;

public class Produto {

    private static int proximoId = 1;

    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private int quantidade;
    private StatusVenda statusVenda;

    public enum StatusVenda {
        NaoVendido,
        Vendido,
        UnidadesVendidas
    }

    public Produto(String nome, String descricao, double preco, int quantidade) {
        this.id = proximoId++;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
        this.statusVenda = StatusVenda.NaoVendido;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public StatusVenda getStatusVenda() {
        return statusVenda;
    }

    public void setStatusVenda(StatusVenda statusVenda) {
        this.statusVenda = statusVenda;
    }

    public void vender(int quantidadeVendida) {
        if (quantidadeVendida > quantidade) {
            System.out.println("ESTOQUE VAZIO");
        } else {
            quantidade -= quantidadeVendida;
            if (quantidade == 0) {
                this.statusVenda = StatusVenda.Vendido;
            } else {
                this.statusVenda = StatusVenda.UnidadesVendidas;
            }
            System.out.println(quantidadeVendida + " UNIDADES VENDIDAS");
        }
    }

    @Override
    public String toString() {
        String status;
        switch (statusVenda) {
            case NaoVendido:
                status = "NÃO VENDIDO";
                break;
            case Vendido:
                status = "VENDIDO";
                break;
            case UnidadesVendidas:
                status = quantidade + " UNIDADES VENDIDAS";
                break;
            default:
                status = "NÃO VENDIDO";
        }
        return "ID: " + id + " | NOME: " + nome + " | DESCRIÇÃO: " + descricao + " | PREÇO: R$" + preco
                + " | QUANTIDADE: " + quantidade + " | STATUS DO PRODUTO: " + status;
    }
}
