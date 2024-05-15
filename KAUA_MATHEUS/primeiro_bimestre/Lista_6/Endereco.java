package KAUA_MATHEUS.primeiro_bimestre.Lista_6;

public abstract class Endereco {

    /*
     * 2. Crie uma classe Endereco com:
        - Com os atributos estado, cidade, bairro, numero e complemento.
        - Método apresentarLogradouro, printa de uma maneira interessante os dados de endereço concatenados.
        - Refatorar locais que utilizavam endereço.
     */

    public String state, city, neighborhood, 
                     street, number, complement;

    void apresentarLogradouro(){
        System.out.printf("Rua: %s\nNúmero: %s\nBairro: %s\nCidade: %s\nEstado: %s\nComplemento: %s\n", 
        this.street, this.number, this.neighborhood, this.city, this.state, this.complement);
    }
    
}