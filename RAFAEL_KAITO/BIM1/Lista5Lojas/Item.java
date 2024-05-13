package BIM1.Lista5Lojas;

public class Item {
    private String id;
    private String nome;
    private String tipo;
    float valor;

    
    public Item(String id, String nome, String tipo, float valor) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
    }
    
    public void setValor(float valor) {
        this.valor = valor;
    }

    public void gerarDescricao(){
        System.out.println("Item de identificação: ".concat(id).concat("\n").concat(tipo).concat("\n")
        .concat(nome).concat(", ").concat(String.valueOf(valor)));

        return;
    }

    public String getNome() {
        return nome;
    }

    public float getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
