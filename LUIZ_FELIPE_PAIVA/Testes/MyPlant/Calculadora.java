package Testes.MyPlant;
import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a operação que quer realizar \n 1 - Adição \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão \n 5 - Sair");
        int opcao = scanner.nextInt();

     
        if (opcao == 1) {
            System.out.println("Digite o valor do primeiro numero");
            double p1 = scanner.nextDouble();
            System.out.println("Digite o valor do segundo numero");
            double p2 = scanner.nextDouble();
            double result = p1 + p2;
            System.out.println("O resultado da adição dos 2 números é " + result);
        }
        if (opcao == 2) {
            System.out.println("Digite o valor do primeiro numero");
            double p1 = scanner.nextDouble();
            System.out.println("Digite o valor do segundo numero");
            double p2 = scanner.nextDouble();
            double result = p1 - p2;
            System.out.println("O resultado da subtração dos 2 números é " + result);
          
        }
        if (opcao == 3) {
            System.out.println("Digite o valor do primeiro numero");
            double p1 = scanner.nextDouble();
            System.out.println("Digite o valor do segundo numero");
            double p2 = scanner.nextDouble();
            double result = p1 * p2;
            System.out.println("O resultado da multiplicação dos 2 números é " + result);
            
        }

        if (opcao == 4) {
            System.out.println("Digite o valor do primeiro numero");
            double p1 = scanner.nextDouble();
            System.out.println("Digite o valor do segundo numero");
            double p2 = scanner.nextDouble();
            double result = p1 / p2;
            System.out.println("O resultado da divisão dos 2 números é " + result);
            
        }

        if (opcao == 5) {
            System.out.println("Fechando calculadora");
            
        }

       
        scanner.close();
    }
}
