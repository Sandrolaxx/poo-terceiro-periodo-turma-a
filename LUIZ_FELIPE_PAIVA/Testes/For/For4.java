package Testes.For;

import java.util.Scanner;

public class For4 {
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Escolha um numero");
       int numero = scanner.nextInt();  
       int contagem = 0;
       for (int i = 0; i < numero; i++){
       if (i % 2 == 0) {
        contagem ++;
       }
       }
       System.out.println("A quantidade de numeros pares de 1 até " + numero +" é: " +contagem);
       scanner.close();
    }
    
}
