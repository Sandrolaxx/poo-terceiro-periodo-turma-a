package primeirobim.listas;

import java.util.Scanner;

public class Lista1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha;

        do {

            System.out.println("Menu:");
            System.out.println("Escolha uma opção: ");
            System.out.println("1. Valor total da compra");
            System.out.println("2. Valor do troco");
            System.out.println("3. Sair do programa");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.println();
                System.out.println("Insira a quantidade de plantas: ");
                int qntdPlanta = scanner.nextInt();

                System.out.println("Insira o valor da planta: ");
                float valorPlanta = scanner.nextFloat();

                float valorTotal;

                if (qntdPlanta <= 0 || valorPlanta <= 0) {
                    System.out.println("Valor inválido");
                    System.out.println();

                } else {
                    valorTotal = qntdPlanta * valorPlanta;

                    System.out.println("O valor a ser pago é " + valorTotal + " reais");
                    System.out.println();
                }
            }

            if (escolha == 2) {
                System.out.println();
                System.out.println("Insira o valor do pagamento do cliente: ");
                float pagCliente = scanner.nextFloat();

                System.out.println("Insira o valor total da compra: ");
                float totalTroco = scanner.nextFloat();

                if (totalTroco < 0 || pagCliente < 0) {
                    System.out.println("Valor inválido");
                    System.out.println();

                }

                else if (pagCliente < totalTroco) {
                    System.out.println("O valor do pagamento do cliente é insuficiente!");
                    System.out.println();

                }

                else {
                    float trocoCompra = pagCliente - totalTroco;
                    System.out.println("O troco é de " + trocoCompra + " reais");
                    System.out.println();
                }
            }

        } while (escolha != 3);

    }
}
