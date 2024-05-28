package KAUA_MATHEUS.primeiro_bimestre.Lista_6;

public class Loja extends Endereco{

    // Cores
    String red = "\u001B[31m";
    String green = "\u001B[32m";
    String yellow = "\u001B[33m";
    String standart = "\u001B[m";

    
    // Criação de Atributos

    String fantasy_name, social_reason, cnpj;
    Vendedor[] sellers;
    Cliente[] clients;


    public Loja(String fantasy_name, String social_reason, String cnpj,
                String state, String number, String complement,
                String city, String neighborhood, String street
    ){
        this.fantasy_name = fantasy_name;
        this.social_reason = social_reason;
        this.cnpj = cnpj;
        this.city = city;
        this.neighborhood = neighborhood;
        this.complement = complement;
        this.street = street;
        this.number = number;
        this.state = state;
    }

    void apresentarSe(){
        System.out.printf("Nome: %s%s%s\n", green, this.fantasy_name, standart);
        System.out.printf("CNPJ: %s%s%s\n", green, this.cnpj, standart);
        System.out.printf("Endereço: Rua %s%s, %s - %s%s\n", green, this.street, this.neighborhood, this.city, standart);
    }

    int contarClientes(){
        return this.clients.length;
    }

    int contarVendedores(){
        return this.sellers.length;
    }


}
