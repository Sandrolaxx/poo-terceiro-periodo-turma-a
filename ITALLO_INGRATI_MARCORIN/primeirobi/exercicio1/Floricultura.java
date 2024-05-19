package primeirobi.exercicio1;
import java.util.Scanner;
public class Floricultura {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean opcao=false;
            int x;
            do{
                System.out.println("\nMenu:\n");
                System.out.println("1 Calcula Preco");
                System.out.println("2 Calcular Troco");
                System.out.println("3 Sair");
                System.out.print("Escolha uma opção: ");
                x = scanner.nextInt();
                switch (x) {
                    case 1:
                        calcPreco();
                        break;
                    case 2:
                        calcTroco();
                        break;
                    case 3:
                        opcao=true;
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            } while (opcao==false);
        }
    }


    public static void calcPreco() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade do produto: ");
        int quantidade = scanner.nextInt();
        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        double precoTot = quantidade * preco;
        System.out.println("O preço total é:R$ " + precoTot);
    }
    public static void calcTroco() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor recebido pelo cliente: ");
        double valRecebido = scanner.nextDouble();
        System.out.print("Digite o valor total da compra: ");
        double valTotal = scanner.nextDouble();


        double troco = valRecebido - valTotal;
        if (troco < 0) {
            System.out.println("Valor recebido insuficiente.");
        } else {
            System.out.println("O troco a ser dado ao cliente é:R$ " + troco);
        }
    }
}
