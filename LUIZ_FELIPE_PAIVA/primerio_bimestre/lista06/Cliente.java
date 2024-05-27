package LUIZ_FELIPE_PAIVA.primerio_bimestre.lista06;

class Cliente {
    private String nome;
    private int idade;
    String estado;
    String cidade;
    String bairro;
    String rua;
    int numero;
    String complemento;

    public Cliente(String nome, int idade, String estado, String cidade, String bairro, int numero, String complemento) {
        this.nome = nome;
        this.idade = idade;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
    }

    public void apresentarSe() {
        System.out.println("NOME: " + nome);
        System.out.println("IDADE: " + idade);
    }

    public String getNome() {
        
        return nome;
    }
}
