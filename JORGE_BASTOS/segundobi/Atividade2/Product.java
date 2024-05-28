package segundobi.Atividade2;

public class Product {
    String name;

    Float price;

    public Product(String name, Float price) {

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
