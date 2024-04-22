package primeirobimestre.ListaSeis;
public class Cliente {
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

    public Cliente(String string) {
    
    }

    public void apresentarse() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public String getNome() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getNome'");
    }
}