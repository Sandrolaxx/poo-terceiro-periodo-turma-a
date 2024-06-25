package Testes.MyPlant;

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        boolean sair = false;
        Scanner scanner = new Scanner(System.in);
        double desconto = 0;

        while (!sair) {
            
        
        System.out.println("Informe o preço do produto");
        double preco = scanner.nextDouble();
        System.out.println("Informe a condição de pagamento \n [1] À vista no cash \n [2] À vista no CC \n [3] Até 2x no cartão \n [4] 3x ou mais \n [5] Para sair");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                desconto = preco*0.90;
                System.out.println("O valor final é "+desconto+ " reais");
                
                break;

            case 2:
                desconto = preco*0.95;
                System.out.println("O valor final é "+desconto+ " reais");
                
                break;

            case 3:
                desconto = preco;
                System.out.println("O valor final é "+desconto+ " reais");
                
                break;

            case 4:
                desconto = preco*1.20;
                System.out.println("O valor final é "+desconto+ " reais");
                
                break;
            
            case 5:
                sair = true;
                System.out.println("Encerrando calculadora");
                break;

        
            default:
            System.out.println("Erro");
                break;
        }
        
    }
    scanner.close();
    }
}
