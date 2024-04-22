package primbi.Lista5;

public class Endereco {
    private String estado;
    private String cidade;
    private String bairro;
    private int numero;
    private String complemento;
    private String rua;


    public String getEstado() {
        return this.estado;
    }

    public String getCidade() {
        return this.cidade;
    }

    public String getBairro() {
        return this.bairro;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public String getRua() {
        return this.rua;
    }



    public Endereco(String estado, String cidade, String bairro, int numero, String complemento) {
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.numero = numero;
        this.complemento = complemento;
    }

    public void apresentarLogradouro() {
        System.out.println(numero + ", " + complemento + ", " + bairro + ", " + cidade + " - " + estado);
    }
}