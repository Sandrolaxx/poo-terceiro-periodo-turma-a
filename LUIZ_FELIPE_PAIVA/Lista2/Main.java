package Lista2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Digite pelo menos 8 números inteiros:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            try {
                numeros.add(scanner.nextInt());
            } catch (Exception e) {
                System.out.println("Entrada inválida, por favor, insira um número inteiro.");
                scanner.next(); 
                i--; 
            }
        }
        List<Integer> numerosPares = numeros.stream()
                                             .filter(num -> num % 2 == 0)
                                             .collect(Collectors.toList());

        System.out.println("Números pares: " + numerosPares);
        
        scanner.close();
    }
}

