package Testes.Discord;

import java.util.Scanner;

public class IMC {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe seu peso");
        Double peso = scanner.nextDouble();
        System.out.println("Informe sua altura");
        Double altura = scanner.nextDouble();

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
        scanner.close();

    }

    
}
