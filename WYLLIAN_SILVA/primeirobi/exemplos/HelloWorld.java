package primeirobi;

import java.util.Scanner;
public class HelloWorld {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a sua idade");
        int idade = scanner.nextInt();

        System.out.println("Minha idade é:" +idade);
    }
}
