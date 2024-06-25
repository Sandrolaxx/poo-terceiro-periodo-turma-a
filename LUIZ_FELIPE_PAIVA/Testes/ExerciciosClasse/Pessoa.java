package Testes.ExerciciosClasse;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public Pessoa(String nome, int idade, double altura, double peso){
        this.altura = altura;
        this.idade = idade;
        this.nome = nome;
        this.peso = peso;

    }

    public void exibirInfo(){
        System.out.println("Nome: "+nome+ "\nIdade: "+idade+ "\nAltura: "+altura+ " metros \nPeso: "+peso);
    }

    public void atualizarAltura (double novaAltura){
    this.altura = novaAltura;
    }

    public void atualizarIdade (int novaIdade){
        this.idade = novaIdade;
    }

    public void calcularIMC(){
        double imc = peso / (altura*2);
        if (imc < 18.5) {
            System.out.println("Voce está abaixo do peso");
        }

        else if (imc >= 18.5 && imc < 25) {
            System.out.println("Voce está no peso ideal");
            
        }
        
        else if (imc > 25 && imc <= 30) {
            System.out.println("Voce está com sobrepeso");
        }
        
        else if (imc > 30 && imc <= 40) {
            System.out.println("Voce esta com obesidade");
        }

        else if (imc > 40) {
            System.out.println("Voce esta com obesidade morbida");
        }
    
    }

    public void saudacao (){
    }

    public void maiorIdade(){
        if (idade >= 18) {
            System.out.println("Maior de idade");
        }
        else{
            System.out.println("Menor de idade");
        }
    }
}
