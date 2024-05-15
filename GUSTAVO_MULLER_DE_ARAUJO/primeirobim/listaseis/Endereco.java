package primeirobim.listaseis;

//PRINTAR ENDEREÇO DE UMA MANEIRA INTERESSANTE

public class Endereco {

    public String estado;
    
    public String cidade;
    
    public String bairro;
    
    public String rua;

    public String cnpj;

    public int numero;

    public String complemento;

    public void apresentarLogradouro () {

        setEstado("São Paulo");
        setCidade("Santos");
        setBairro("centro");
        setRua("Rua das Flores");
        setNumero(123);
        setComplemento("Apto 101");

        System.out.println("Informações ao contrário");

        String showEndereco = "Estado: " + getEstado() +  "\n" +"Cidade: " + getCidade() + "\n" + "Bairro: " + getBairro() + "\n" +
        "Rua: " + getRua() + "\n" +"Número: " + getNumero() + "\n" + "Complemento: " + getComplemento() +  "\n";
        for (int i = showEndereco.length() - 1; i >= 0; i--) {
            System.out.print(showEndereco.charAt(i));
        }

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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
