package Testes.Discord;
import java.util.Scanner;

public class Media {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, nota3, nota4;

        System.out.println("Digite a primeira nota");
        nota1 = scanner.nextDouble();
        
        System.out.println("Digite a segunda nota");
        nota2 = scanner.nextDouble();
        
        System.out.println("Digite a terceira nota");
        nota3 = scanner.nextDouble();
        
        System.out.println("Digite a quarta nota");
        nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("A média final é: %.2f \n", media);

        if (media < 4) {
            System.out.println("Reprovou");
        }
        else if (media > 4 && media <= 6.99) {
            System.out.println("Exame");
        }
        else if (media >= 7){
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Erro");
        }
        scanner.close();

    }
}
