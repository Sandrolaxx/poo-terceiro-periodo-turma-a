package PRIMEIRO_BI.Listasete;


public class Endereco {
    private String rua;
    private String bairro;
    private String estado;
    private String cidade;
    private int numero;
    private String complemento;


    public Endereco(String rua, String bairro, String cidade, String estado, int numero, String complemento){
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.numero = numero;
        this.complemento = complemento;
    }
    public void apresentarLogradouro(){
        System.out.println("Rua: "+rua+"\nBairro: "+bairro+"\nNumero: "+numero+"\nCidade: "+cidade+"\nEstado: "+estado+"\nComplemento: "+complemento);
    }
}



