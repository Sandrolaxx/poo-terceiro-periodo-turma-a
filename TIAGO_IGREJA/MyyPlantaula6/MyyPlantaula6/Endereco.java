


public class Endereco {
    String estado, cidade, bairro, rua, numero, complemento;

    public Endereco(String estado, String cidade, String bairro, String rua, String numero, String complemento) {
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
    }

    public void apresentarLogradouro() {
        System.out.printf("%s, %s, %s, %s, %s, %s\n", estado, cidade, bairro, rua, numero, complemento);
    }
}
