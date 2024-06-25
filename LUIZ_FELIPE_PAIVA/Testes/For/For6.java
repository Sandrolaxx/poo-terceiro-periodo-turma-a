package Testes.For;

import java.util.Scanner;

public class For6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();

        System.out.println("Números divisíveis por 3 e 5 de 1 até " + n + ":");

        
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) { 
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
