public class Item 
{
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
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    void gerarDescricao()
    {
        System.out.println("Id: " + id + " Nome: " + nome + " Tipo: " + tipo + "Valor: " + valor);
    }

    
}
