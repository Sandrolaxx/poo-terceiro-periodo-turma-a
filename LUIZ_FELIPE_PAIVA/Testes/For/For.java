package Testes.For;

import java.util.Scanner;

public class For {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um numero para ser realizado a tabuada até 10 do mesmo");
        int numero = scanner.nextInt();

        for (int i = 0 ; i <= 10; i++) {
            int res = numero * i;

            System.out.println(+numero+ " x " +i+ " = "+ res);
        }
        
        scanner.close();
    }
}
