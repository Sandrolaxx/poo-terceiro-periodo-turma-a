package KAUA_MATHEUS.primeiro_bimestre.Lista_6;

public class Loja{

    // Cores
    String red = "\u001B[31m";
    String green = "\u001B[32m";
    String yellow = "\u001B[33m";
    String standart = "\u001B[m";

    
    // Criação de Atributos

    String fantasy_name, social_reason, cnpj;
    Endereco endereco;
    Vendedor[] sellers;
    Cliente[] clients;


    public Loja(
        String fantasy_name, String social_reason, String cnpj, 
        Endereco endereco
    ){
        this.fantasy_name = fantasy_name;
        this.social_reason = social_reason;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    void setSellers(Vendedor[] sellers){
        this.sellers = sellers;
    }

    void setClients(Cliente[] clients){
        this.clients = clients;
    }

    void apresentarSe(){
        System.out.printf("Nome: %s%s%s\n", green, this.fantasy_name, standart);
        System.out.printf("CNPJ: %s%s%s\n", green, this.cnpj, standart);
        System.out.printf("Endereço: Rua %s%s, %s - %s%s\n", green, endereco.street, endereco.neighborhood, endereco.city, standart);
    }

    int contarClientes(){
        return this.clients.length;
    }

    int contarVendedores(){
        return this.sellers.length;
    }


}
