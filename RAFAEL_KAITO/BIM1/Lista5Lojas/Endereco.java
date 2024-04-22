package BIM1.Lista5Lojas;

public class Endereco {
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private String numero;
    private String complemento;

    public Endereco(String estado, String cidade, String bairro, String rua, String numero, String complemento) {
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
    }

    public void apresentarLogradouro(){
        System.out.println("Endereço: ".concat(cidade).concat(", ").concat(estado).concat("\n").concat(rua)
        .concat(", ").concat(numero).concat("\n").concat(bairro).concat(", ").concat(complemento));

        return;
    }
}
