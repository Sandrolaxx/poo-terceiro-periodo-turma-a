package WILLYAM_GABRIEL.PRIMEIRO_BIMESTRE.ATIVIDADES.ListaCinco;
class Cliente {
    String nome;
    int idade;
    String cidade;
    String bairro;
    String rua;

    public Cliente(String nome, int idade, String cidade, String bairro, String rua) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
    }

    public void apresentarSe() {
        System.out.println("NOME: " + nome);
        System.out.println("IDADE: " + idade);
    }
}