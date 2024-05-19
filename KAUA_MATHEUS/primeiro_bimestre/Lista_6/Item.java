package KAUA_MATHEUS.primeiro_bimestre.Lista_6;

public class Item {

    String id, name, type;
    float value;

    public void setItem(String id, String name, String type, float value){
        this.id = id;
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public void gerarDescricao(){
        System.out.printf("Id: %s\nItem: %s\n", this.id, this.name);
        System.out.printf("Tipo: %s\nValor: %.2f\n", this.type, this.value);
    }

}
