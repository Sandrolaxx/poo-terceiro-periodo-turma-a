package KAUA_MATHEUS.primeiro_bimestre.Lista_7;

public class Endereco {

    public String 
    state, city, neighborhood, 
    street, number, complement;

    public Endereco(
        String state, String city, String neighborhood,
        String street, String number, String complement
    ){
        this.state = state;
        this.city = city;
        this.neighborhood = neighborhood;
        this.street = street;
        this.number = number;
        this.complement = complement;
    }

    void apresentarLogradouro(){
        System.out.printf("Rua: %s\nNúmero: %s\nBairro: %s\nCidade: %s\nEstado: %s\nComplemento: %s\n", 
        this.street, this.number, this.neighborhood, this.city, this.state, this.complement);
    }
    
}