package primeirobi.lists.Lista7;

public class Endereco {
    private String estado, 
        cidade, 
        bairro, 
        numero, 
        complemento, 
        rua;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    void apresentarLogradouro() {
        System.out.println("Rua: " + rua + ", " + numero + ", bairro " + bairro + ", " + complemento + ", " + cidade + ", " + estado);
    }
}
