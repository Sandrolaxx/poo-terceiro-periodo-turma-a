package exercises.sistemadonagabriela6;

public class Pessoa{
    
    private String nome;
    private int idade;
    private Endereco Endereco;

    // Getters e Seters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return Endereco;
    }

    public void setEndereco(Endereco endereco) {
        Endereco = endereco;
    }
    
}