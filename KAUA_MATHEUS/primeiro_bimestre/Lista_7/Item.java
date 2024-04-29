package KAUA_MATHEUS.primeiro_bimestre.Lista_6;

public class Item {

    private String name, type;
    private float value;
    private int id;

    public Item(Integer id, String name, String type, float value){
        this.id = id;
        this.name = name;
        this.type = type;
        this.value = value;
    }

    float getValue(){
        return value;
    }

    public void setItem(String name, String type, float value){
        this.name = name;
        this.type = type;
        this.value = value;
    }
    

    public void gerarDescricao(){
        System.out.printf("Id: %s\nItem: %s\n", this.id, this.name);
        System.out.printf("Tipo: %s\nValor: %.2f\n", this.type, this.value);
    }

}
