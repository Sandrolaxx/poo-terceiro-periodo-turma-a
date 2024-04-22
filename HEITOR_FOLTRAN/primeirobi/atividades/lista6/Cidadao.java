package primeirobi.atividades.lista6;

public class Cidadao {
    
    protected String nome; 
    protected String cidade; 
    protected String bairro; 
    protected String rua;
    protected String loja;
    protected int idade;

    public Cidadao(String nome, String cidade, String bairro, String rua, String loja, int idade) {
        this.nome = nome;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.loja = loja;
        this.idade = idade;
    }

}
