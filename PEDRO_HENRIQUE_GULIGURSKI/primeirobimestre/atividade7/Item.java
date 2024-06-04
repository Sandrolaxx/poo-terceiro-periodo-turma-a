package primeirobimestre.atividade7;

public class Item {
    private Integer id;
    private String nome;
    private String tipo;
    private Float valor;

    public Item(Integer id, String nome, String tipo, Float valor){
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
    }

    public float getValor(){
        return valor;
    }

    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public String getTipo(){
        return tipo;
    }
}
