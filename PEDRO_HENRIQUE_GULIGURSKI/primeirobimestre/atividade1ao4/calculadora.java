package primeirobimestre.atividade1ao4;

import java.util.Scanner;
import java.io.IOException;

public class calculadora {
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor unitário do produto: ");
        int valor_produto = input.nextInt();

        System.out.println("Digite a quantidade de produtos: ");
        int qtd = input.nextInt();

        int valor_total = valor_produto * qtd;
        System.out.println("O valor total da compra foi: " + valor_total);

        System.out.println("Qual foi o valor pago?");
        int valor_pago = input.nextInt();
        boolean sair = false;

        while (sair == false) {
            System.out.println("--------------------------------");
            System.out.println("Menu: \n[1] - Calcular preço total\n[2] - Calcular troco\n[3] - Sair" );
            System.out.println("--------------------------------");
            switch (input.nextInt()) {
                case 1:  
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();                  
                    System.out.println("O valor total foi: " + valor_total);
                    break;
                case 2:
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    if (valor_total == valor_pago) {
                        System.out.println("Não há troco.");
                    } else if (valor_pago < valor_total){
                        System.out.println("Está faltando " + (valor_total - valor_pago) + " reais.");
                    } else {
                        System.out.println("O troco é " +  (valor_pago - valor_total) + " reais.");
                    }
                    break;
                case 3:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        input.close();
    }
}
