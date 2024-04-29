package primeirobi.aulaseis;

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
        System.out.println("ID: " + id);
        System.out.println("NOME: " + nome);
        System.out.println("TIPO: " + tipo);
        System.out.println("VALOR: " + valor);
    }

    public void apresentarSe() {
        System.out.println("NOME: " + nome);
        System.out.println("VALOR: " + valor);
    }

    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return "ID: " + id + ", NOME: " + nome + ", TIPO: " + tipo + ", VALOR: " + valor;
    }
}
