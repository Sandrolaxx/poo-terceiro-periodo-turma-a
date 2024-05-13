package KAUA_MATHEUS.primeiro_bimestre.Lista_6;

public class Cliente extends Endereco{

    // Cores
    String red = "\u001B[31m";
    String green = "\u001B[32m";
    String yellow = "\u001B[33m";
    String standart = "\u001B[m";
    
    // Criação de Atributos

    String name;
    int age;

    public Cliente(String name, int age,
    String state, String number, String complement,
    String city, String neighborhood, String street){

        // Construtor da Classe Cliente
        this.name = name;
        this.age = age;
        this.city = city;
        this.neighborhood = neighborhood;
        this.street = street;
        this.city = city;
        this.neighborhood = neighborhood;
        this.complement = complement;
        this.street = street;
        this.number = number;
        this.state = state;

    }

    void apresentarSe(){
        System.out.printf("Meu nome é %s%s%s e tenho %s%d%s anos!\n",green, this.name, standart, green, this.age, standart);
        System.out.printf("Endereço: Rua %s%s, %s - %s%s\n", green, this.street, this.neighborhood, this.city, standart);
    }

}
