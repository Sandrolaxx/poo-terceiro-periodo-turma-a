package primeirobi.Exercicio6;

public class Endereco {
    String estado;
    String cidade;
    String bairro;
    Integer numero;
    String complemento;
    String rua;
    
    public void apresentarLogradouro() {
        System.out.println("--Endereço--");
        System.out.println("Estado: " + estado);
        System.out.println("Cidade: " + cidade);
        System.out.println("Bairro: " + bairro);
        System.out.println("Rua: "+rua);
        System.out.println("Número: " + numero);
        System.out.println("Complemento: " + complemento);
    }
    
}
