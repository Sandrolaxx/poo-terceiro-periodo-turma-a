package Testes.Discord;

import java.util.Random;
import java.util.Scanner;

public class Advinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean sair = false;
       

        System.out.println("Tente advinhar o numero entre 1 e 100, ou digite 0 para sair");
        

        while (!sair) {
            System.out.println("Escolha um número de 1 a 100 e 0 para sair");
            int escolha = scanner.nextInt();

            if (escolha == 0) {
                sair = true;
                System.out.println("Você escolheu sair. Obrigado por jogar!");
            }
            else {
                int computerChoice = random.nextInt(100);
                int tentativas = 0;

                while (escolha != computerChoice) {
                    tentativas++;
                    if (escolha < 1 || escolha > 100) {
                        System.out.println("Por favor, digite um número entre 1 e 100.");
                    } else if (escolha < computerChoice) {
                        System.out.println("O número é maior. Tente novamente.");
                    } else {
                        System.out.println("O número é menor. Tente novamente.");
                    }
                    System.out.print("Digite seu palpite (ou 0 para sair): ");
                    escolha = scanner.nextInt();
                }

                if (escolha == computerChoice) {
                    tentativas++;
                    System.out.println("Parabéns! Você acertou o número " + computerChoice + " em " + tentativas + " tentativas.");
                }
            }
        }
        scanner.close();
    }
}
            