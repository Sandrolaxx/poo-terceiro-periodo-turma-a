package PRIMEIRO_BIMESTRE.lists.Lista6.lista6;

public class Item {
    private String id, name, type;
    private float price;

    public Item(String name, String type, String id, float price) {
        this.name = name;
        this.type = type;
        this.id = id;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    void showDescription() {
        System.out.println("ID: " + id + ", " + name + ", "
                + type + ", " + price);
    }
}
