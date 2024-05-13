package ListaSeis;

class Endereco {
    private String estado;
    private String cidade;
    private String bairro;
    private int numero;
    private String complemento;

    public Endereco(String estado, String cidade, String bairro, int numero, String complemento) {
        this.estado = estado;      
        this.cidade = cidade;
        this.bairro = bairro;
        this.numero = numero;
        this.complemento = complemento;
    }
    public void apresentarLogradouro(){
        System.out.println("ESTADO: " + estado);
        System.out.println("CIDADE: " + cidade);
        System.out.println("BAIRRO: " + bairro);
        System.out.println("NUMERO: " + numero);
        System.out.println("COMPLEMENTO: " + complemento);
    }
    
}
