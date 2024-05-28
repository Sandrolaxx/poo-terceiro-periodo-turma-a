package primeirobi.lists.Lista6;

public class Endereco {
    String estado, cidade, bairro, numero, complemento, rua;

    void apresentarLogradouro() {
        System.out.println(rua + ", " + numero + ", bairro " + bairro + ", " + complemento + ", " + cidade + ", " + estado);
    }
}