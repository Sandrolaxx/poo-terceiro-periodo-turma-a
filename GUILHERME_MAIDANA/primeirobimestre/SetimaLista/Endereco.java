package primeirobimestre.SetimaLista;

public class Endereco {
    private String cidade;


    private String bairro;


    private String rua;

    private String complemento;

    private String estado;
   
   public String apresentarLogradouro(){
     return ("Endereço: "+ this.cidade+","+this.bairro+","+this.rua+","+this.estado+","+this.complemento);
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

    public String getEstado() {
        return estado;
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getComplemento() {
        return complemento;
    }


    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

}
