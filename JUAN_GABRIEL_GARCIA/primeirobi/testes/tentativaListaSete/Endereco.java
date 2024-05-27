package primeirobi.testes.tentativaListaSete;

public class Endereco {
    
   private String
        estado,
        cidade,
        bairro,
        rua,
        numero,
        complemento;
        
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



    public void apresentarLogradouro() {
        
        String msg = " Estado: " + estado + "\n Cidade: "
         + cidade + "\n Bairro: " + bairro + "\n Rua: " + rua + "\n Numero: " 
         + numero + "\n Complemento: " + complemento + "\n";

         System.out.println(msg);
    }
}
