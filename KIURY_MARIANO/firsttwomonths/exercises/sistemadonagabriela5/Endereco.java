// 2. Crie uma classe Endereco com:
// - Com os atributos estado, cidade, bairro, numero e complemento.
// - Método apresentarLogradouro, printa de uma maneira interessante os dados de endereço concatenados.
// - Refatorar locais que utilizavam endereço.

public class Endereco {
    
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private int numero;
    private String complemento;

    void apresentarLogradouro(){
        System.out.println("===================================");
        System.out.println("          Endereço:");
        System.out.println("-----------------------------------");
        System.out.printf("Rua: %s, %s%n", rua, numero);
        System.out.printf("Cidade: %s, Bairro: %s, Estado: %s, Complemento: %s%n", cidade, bairro, estado.toUpperCase(), complemento);
        System.out.println("===================================");
    }

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

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    } 
}