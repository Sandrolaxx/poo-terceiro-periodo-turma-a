package Testes.Static;

public class Carro {
    private String nome;
    private int ano;
    public static int anoDaCompra = 2023;
    public Carro(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    
}
