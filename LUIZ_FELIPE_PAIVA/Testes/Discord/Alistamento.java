package Testes.Discord;
import java.util.Scanner;

public class Alistamento {
    

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano em que nasceu");
        int ano = scanner.nextInt();
        int idade = 2024 - ano;

        if (idade == 18){
            System.out.println("Ta na hora de calçar a botina e pegar a enchada");
        }

        else if (idade < 18) {
            System.out.println("Se safou");
            int alistar = 18;
            int faltam = alistar - idade;
            System.out.println("Ainda faltam " +faltam + " anos para se alistar");
            
        }
        
        else {
            System.out.println("Passou da hora amigão");
            int passou = idade - 18;
            System.out.println("Voce devia ter se alistado há "+passou + " anos atrás");
        }
        scanner.close();
    }
}
