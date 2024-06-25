package Testes.Discord;

import java.util.Scanner;
import java.util.Random;

public class JokenPo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean sair = false;
        
        while (!sair) {
            System.out.println("Escolha: 0 = Pedra, 1 = Papel, 2 = Tesoura, 3 = Sair");
            int userChoice = scanner.nextInt();
            
            if (userChoice < 0 || userChoice > 3) {
                System.out.println("Escolha inválida. Tente novamente.");
                
            }
            
            if (userChoice == 3) {
                sair = true;
                
            }
            
            int computerChoice = random.nextInt(3);
            System.out.println("Computador escolheu: " + choiceToString(computerChoice));
            
            String result = determineWinner(userChoice, computerChoice);
            System.out.println(result);
        }
        
        scanner.close();
        System.out.println("Obrigado por jogar!");
    }
    
    public static String choiceToString(int choice) {
        switch (choice) {
            case 0: return "Pedra";
            case 1: return "Papel";
            case 2: return "Tesoura";
            default: return "Inválido";
        }
    }
    
    public static String determineWinner(int userChoice, int computerChoice) {
        if (userChoice == computerChoice) {
            return "Empate!";
        } else if ((userChoice == 0 && computerChoice == 2) ||
                   (userChoice == 1 && computerChoice == 0) ||
                   (userChoice == 2 && computerChoice == 1)) {
            return "Você ganhou!";
        } else {
            return "Você perdeu!";
        }
    }
}


