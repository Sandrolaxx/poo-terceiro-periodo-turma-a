package Testes.For;

import java.util.Scanner;

public class For5 {
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Escolha um numero");
       int numero = scanner.nextInt();  
       int contagem = 1;
       for (int i = 1; i < numero; i++){
       
        contagem *= i;
       }
       System.out.println("O fatorial de " +numero + " é: " + contagem);
       scanner.close();
       }
      
    }
    
