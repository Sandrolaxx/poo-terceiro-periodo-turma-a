package SEGUNDO_BIMESTRE.listas.lista2;

public class Produto {
    
    String name;

    Float price;

    public Produto(String name, Float price) {

        setName(name);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

}
