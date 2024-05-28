package primeirobim.listas;

import java.util.Scanner;

public class Lista2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha;
        int [] vetorPlantas = new int[100];
        float [] vetorVendas = new float[100];
        float [] vetorDesconto = new float[100];
        int contVendas = 0;

        do {

            System.out.println("Menu:");
            System.out.println("Escolha uma opção: ");
            System.out.println("1. Valor total da compra");
            System.out.println("2. Valor do troco");
            System.out.println("3. Registro de Vendas");
            System.out.println("4. Sair do programa");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println();
                    System.out.println("Insira a quantidade de plantas: ");
                    int qntdPlanta = scanner.nextInt();

                    System.out.println("Insira o valor da planta: ");
                    float valorPlanta = scanner.nextFloat();


                    if (qntdPlanta <= 0 || valorPlanta <= 0) {
                        System.out.println("Valor inválido");
                        System.out.println();

                    } else {
                        float valorTotal = qntdPlanta * valorPlanta;

                        if (qntdPlanta > 10) {
                            float valorDesconto = valorTotal * 0.95f; 
                            System.out.println("O valor a ser pago é " + valorDesconto + " reais");
                            vetorPlantas[contVendas] = qntdPlanta;
                            vetorVendas[contVendas] = valorTotal;
                            vetorDesconto[contVendas]= valorTotal - valorDesconto;
                            System.out.println();  
                        }

                        else{
                        System.out.println("O valor a ser pago é " + valorTotal + " reais");
                        vetorPlantas[contVendas] = qntdPlanta;
                        vetorVendas[contVendas] = valorTotal;
                        vetorDesconto[contVendas] = 0;
                        System.out.println();
                    }
                    contVendas++;
                    }
                    break;

                case 2:
                    System.out.println();
                    System.out.println("Insira o valor do pagamento do cliente: ");
                    float pagCliente = scanner.nextFloat();

                    System.out.println("Insira o valor total da compra: ");
                    float totalTroco = scanner.nextFloat();

                    if (totalTroco < 0 || pagCliente < 0) {
                        System.out.println("Valor inválido");
                        System.out.println();

                    } else if (pagCliente < totalTroco) {
                        System.out.println("O valor do pagamento do cliente é insuficiente!");
                        System.out.println();

                    } else {
                        float trocoCompra = pagCliente - totalTroco;
                        System.out.println("O troco é de " + trocoCompra + " reais");
                        System.out.println();
                    }
                    break;

                case 3:
                System.out.println("Registro de Vendas: ");
                for(int i = 0; i < contVendas; i++){
                    System.out.println("Venda número " + (i + 1) + " :");
                    System.out.println("Quantidade de plantas: " + vetorPlantas[i]);
                    System.out.println("Valor total da compra: " + vetorVendas[i]);
                    System.out.println("Valor do desconto: " + vetorDesconto[i]);
                    System.out.println();
                }
                break;

                case 4:
                System.out.println("Saindo do programa.");
        
                    break;

                default:
                    System.out.println("Opção inválida");
                    System.out.println();
                    break;
            }

        } while (escolha != 4);

    }
}
