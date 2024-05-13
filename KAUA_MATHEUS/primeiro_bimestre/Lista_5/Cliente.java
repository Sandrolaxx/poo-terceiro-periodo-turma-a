package KAUA_MATHEUS.primeiro_bimestre.Lista_5;

public class Cliente {

    // Cores
    String red = "\u001B[31m";
    String green = "\u001B[32m";
    String yellow = "\u001B[33m";
    String standart = "\u001B[m";
    
    // Criação de Atributos

    String name, city, neighborhood, street;
    int age;

    public Cliente(String name, int age, String city,
    String neighborhood, String street){

        // Construtor da Classe Cliente
        this.name = name;
        this.age = age;
        this.city = city;
        this.neighborhood = neighborhood;
        this.street = street;

    }

    public void apresentarSe(){
        System.out.printf("Meu nome é %s%s%s e tenho %s%d%s anos!\n",green, this.name, standart, green, this.age, standart);
        System.out.printf("Endereço: Rua %s%s, %s - %s%s\n", green, this.street, this.neighborhood, this.city, standart);
    }

}
