package primeirobi.atividades;

import java.util.Scanner;

public class CalculadoraGab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int option;
        
        do {
            System.out.println("[1] - Calcular Preço Total");
            System.out.println("[2] - Calcular Troco");
            System.out.println("[3] - Sair");
            
            System.out.print("Escolha uma opção: ");
            option = input.nextInt();
            
            switch (option) {
                case 1:
                    calculateTotalPrice(input);
                    break;
                case 2:
                    calculateChange(input);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 3);
        
        input.close();
    }
    
    public static void calculateTotalPrice(Scanner input) {
        System.out.print("Digite a quantidade da planta vendida: ");
        int quantity = input.nextInt();
        
        System.out.print("Digite o preço unitário da planta: ");
        double unitPrice = input.nextDouble();
        
        double totalPrice = quantity * unitPrice;
        System.out.println("O preço total é: " + totalPrice);
    }
    
    public static void calculateChange(Scanner input) {
        System.out.print("Digite o valor recebido pelo cliente: ");
        double amountReceived = input.nextDouble();
        
        System.out.print("Digite o valor total da compra: ");
        double totalAmount = input.nextDouble();
        
        double change = amountReceived - totalAmount;
        System.out.println("O troco a ser dado ao cliente é: " + change);
    }
}