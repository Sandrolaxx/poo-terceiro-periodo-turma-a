package primeirobi.atividades.lista6;

public class Endereco {

    String cidade, estado, bairro, rua, complemento;
    int numero;

    public Endereco(String estado, String cidade, String bairro, String rua, int numero, String complemento){

        //(achei estranho pedir o número e não pedir a rua)

        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;

    }

    void apresentarLogadouro(){

        System.out.println("Endereço: " + this.cidade + " - " + this.estado + ", Bairro " + bairro + " - Rua " + this.rua + ", Nº " + numero + "\nComplementos: " + this.complemento);
        
    }

}
