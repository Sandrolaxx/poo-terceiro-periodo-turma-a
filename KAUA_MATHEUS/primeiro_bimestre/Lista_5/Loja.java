package KAUA_MATHEUS.primeiro_bimestre.Lista_5;

public class Loja {

    // Cores
    String red = "\u001B[31m";
    String green = "\u001B[32m";
    String yellow = "\u001B[33m";
    String standart = "\u001B[m";

    
    // Criação de Atributos

    String fantasy_name, social_reason, cnpj, city, neighborhood, street;
    Vendedor[] sellers;
    Cliente[] clients;

    public Loja(String fantasy_name, String social_reason, String cnpj,
                String city, String neighborhood, String street
    ){
        this.fantasy_name = fantasy_name;
        this.social_reason = social_reason;
        this.cnpj = cnpj;
        this.city = city;
        this.neighborhood = neighborhood;
        this.street = street;
    }

    public void apresentarSe(){
        System.out.printf("Nome: %s%s%s\n", green, this.fantasy_name, standart);
        System.out.printf("CNPJ: %s%s%s\n", green, this.cnpj, standart);
        System.out.printf("Endereço: Rua %s%s, %s - %s%s\n", green, this.street, this.neighborhood, this.city, standart);
    }

    public int contarClientes(){
        return this.clients.length;
    }

    public int contarVendedores(){
        return this.sellers.length;
    }


}
