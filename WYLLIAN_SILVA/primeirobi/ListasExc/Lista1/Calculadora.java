package primeirobi.ListasExc;

import java.util.Scanner;

public class Calculadora {
    
 public static void main(String[] args) {

        System.out.println("Selecionea sua opção");
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {

            menuopcoes();
            opcao = scanner.nextInt();

            switch (opcao){

                case 1:
                    precototal(scanner);
                    break;
                case 2:
                    trocototal(scanner);
                    break;
                case 3:
                    System.out.println("Saindo da calculadora");
                    break;
                default:
                System.out.println("Opção inválida!");
            }
        } while (opcao != 3);

        scanner.close();

    }

    public static void menuopcoes() {

        System.out.println("1 - Calcular preço total");
        System.out.println("2 - Calcular troco");
        System.out.println("3 - Sair da calculadora");
    }

    public static void precototal(Scanner scanner) {

        System.out.println("Quantas plantas foram compradas?");
        int x = scanner.nextInt();

        System.out.println("Qual o valor da planta?");
        int y = scanner.nextInt();

        double precoplanta = x * y;

        System.out.println("O preço total ficou: R$" +precoplanta);
    }

    public static void trocototal(Scanner scanner) {

        System.out.println("Qual foi o valor total da compra?");
        int z = scanner.nextInt();

        System.out.println("Qual foi o valor pago?");
        int n = scanner.nextInt();

        double troco = n - z;
        
        if (troco >= 0){

        System.out.println("O troco ficou: R$" +troco);

        }else{
            System.out.println("Valor insuficiente");
        }
    }

}
