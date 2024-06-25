package primerio_bimestre.lista06;

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

    public void apresentarLogradouro() {
        System.out.println("Estado: " + estado);
        System.out.println("Cidade: " + cidade);
        System.out.println("Bairro: " + bairro);
        System.out.println("Número: " + numero);
        System.out.println("Complemento: " + complemento);
    }
}


