package Testes.Lista5;

public class Item {
    int id;
    String nome;
    String tipo;
    double valor;
    public Item(int id, String nome, String tipo, double valor){
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
    }

    public void gerarDescricao(){
        System.out.println("ID do item: "+id+"\nNome do item: "+nome+ "\nTipo do item: "+tipo+ "\nValor do item: "+valor);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
