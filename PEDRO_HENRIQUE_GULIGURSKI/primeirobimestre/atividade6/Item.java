package primeirobimestre.atividade6;

public class Item {
    String id;
    String nome;
    String tipo;
    Float valor;

    public Item(String id, String nome, String tipo, Float valor){
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
    }

    public float getValor(){
        return valor;
    }
}
