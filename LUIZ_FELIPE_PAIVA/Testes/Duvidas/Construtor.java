package Testes.Duvidas;

public class Construtor {
    private String nome;
    private int idade;
    private double altura;

    public Construtor(String nome, int idade, double altura){
        this.altura = altura;
        this.nome = nome;
        this.idade = idade;
    }
    public void imprimeInfo(){
        System.out.println("Nome "+nome+ " Idade: "+idade+" altura "+altura);
    }
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
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
