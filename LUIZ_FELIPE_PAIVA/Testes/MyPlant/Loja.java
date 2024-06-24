package Testes.MyPlant;
import java.util.Scanner;

public class Loja {

    public static void main(String[] args) {
        boolean sair = false;
        Scanner scanner = new Scanner(System.in);
        double total = 0; 

        while (!sair) {
            System.out.println("\n [1] - Calcular Preço Total \n [2] - Calcular Troco \n [3] - Sair");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Digite a quantidade de plantas compradas:");
                int quantidade = scanner.nextInt();
                System.out.println("Digite o valor das plantas:");
                double valor = scanner.nextDouble();
                total = quantidade * valor; 

                System.out.println("O valor total da compra foi: " + total + " reais");
            } else if (opcao == 2) {
                if (total != 0) { 
                    System.out.println("Informe o valor pago pelo cliente:");
                    double pago = scanner.nextDouble();
                    double troco = pago - total;
                    System.out.println("O valor do troco é: " + troco + " reais");
                } else {
                    System.out.println("Erro: Calcule o preço total primeiro.");
                }
            } else if (opcao == 3) {
                sair = true;
                System.out.println("Encerrando calculadora");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}