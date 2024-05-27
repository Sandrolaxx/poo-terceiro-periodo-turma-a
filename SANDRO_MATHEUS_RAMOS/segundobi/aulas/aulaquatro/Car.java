package segundobi.aulas.aulaquatro;

public class Car implements Comparable<Car> {
    
    private String name;

    private String brand;

    private Integer year;

    public Car(String name, String brand, Integer year) {
        this.name = name;
        this.brand = brand;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public int compareTo(Car carToCampare) {
        return this.year - carToCampare.getYear();
    }

}
