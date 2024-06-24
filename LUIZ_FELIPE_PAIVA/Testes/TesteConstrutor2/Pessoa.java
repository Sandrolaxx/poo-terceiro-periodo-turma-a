package Testes.TesteConstrutor2;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    

    public Pessoa(String nome, int idade, double altura){
        System.out.println("Uma pessoa acaba de nascer");
        this.altura = altura; 
        this.nome = nome;
        this.idade = idade;
    }

    public void imprimirDados(){
        System.out.println("Nome "+nome+ " Altura "+altura+ "m Idade " +idade);
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
