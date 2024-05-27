package primeirobi.atividades.lista7;

public class Cidadao {
    
    private String nome; 
    private String cidade; 
    private String bairro; 
    private String rua;
    private String loja;
    private int idade;

    public Cidadao(String nome, String cidade, String bairro, String rua, String loja, int idade) {
        this.nome = nome;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.loja = loja;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }
    public void setId(int idade) {
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
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


    public String getLoja() {
        return loja;
    }
    public void setLoja(String loja) {
        this.loja = loja;
    }



}
