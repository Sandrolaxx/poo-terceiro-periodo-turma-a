
package primerio_bimestre;

import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
        Scanner scanf = new Scanner (System.in);
        System.out.println("Informe o número de plantas");
        int Plantas = scanf.nextInt();
        System.out.println("Informe o preço da planta");
        double precoPlanta = scanf.nextDouble();
        System.out.println("Informe o valor total pago pelo cliente");
        double precoTotal = scanf.nextDouble();

        System.out.println("Escolha uma das 3 opções:  \n Opção 1 = Calcular preço total  \n Opção 2 = Calcular troco  \n Opção 3 = Sair");
        int Opçao = scanf.nextInt();

        switch (Opçao) {
            case 1: double valorTotal = Plantas * precoPlanta;
            System.out.println("O valor total foi " +valorTotal);
            break;

            case 2: double valorTotal2 = Plantas * precoPlanta;
            double Troco = precoTotal - valorTotal2;
            System.out.println("O valor total do troco sera: " +Troco);
            break;

            case 3:
            System.out.println("Encerrando programa");
            break;

            default: System.out.println("Erro");
            break;
        }
        scanf.close();
}
}