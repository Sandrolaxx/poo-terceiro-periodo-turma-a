

public class Loja {
    private String nome;
    private Endereco endereco;

    public Loja(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void apresentarLoja() {
        System.out.println("Nome da Loja: " + nome);
        System.out.print("Endereço: ");
        endereco.apresentarLogradouro();
    }

    // Getters e Setters, se necessário
}
