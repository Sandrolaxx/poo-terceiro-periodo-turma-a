package primeirobi.exemplos;

public class Auladois {
    
    public static void main(String[] args) {
        int idade = 20;
        int velocidade = 70;

        System.out.println("Minha idade é: " + idade);
        System.out.println(idade < 18 ? "Menor de idade" : "Maior de idade");

        if (velocidade < 60 && velocidade < 40) {
            System.out.println("Média");
        }

        if (velocidade > 60 && velocidade < 80) {
            System.out.println("Grave");
        }

        if (velocidade > 80) {
            System.out.println("Gravemente Grave");
        }
        
    }
}
