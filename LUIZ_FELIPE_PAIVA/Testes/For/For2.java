package Testes.For;

import java.util.Scanner;

public class For2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        System.out.println("Escolha um número");
        int numero = scanner.nextInt();

        for(int i = 0; i < numero; i++){
         
            soma += i;
        }

        System.out.println("A soma dos números de 1 até " + numero + " é: " +soma);
        scanner.close();
    }
}
