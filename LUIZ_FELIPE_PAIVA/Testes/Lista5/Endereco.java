package Testes.Lista5;

public class Endereco {
    private String bairro;
    private int numero;
    private String complemento;

public Endereco (String bairro, int numero, String complemento){
    this.bairro = bairro;
    this.numero = numero;
    this.complemento = complemento;
}


public void apresentarLogradouro(){
    System.out.println("Endereço: \nBairro: "+bairro+ "\nNumero: "+numero+"\nComplemento: "+complemento);
}


public String getBairro() {
    return bairro;
}


public void setBairro(String bairro) {
    this.bairro = bairro;
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
