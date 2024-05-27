package BIM1;

import java.util.Scanner;

public class Teste1 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int opc;
        do
        {
            System.out.println("\nSeleciona a ação:\n[1]Cálculo de preço total\n[2]Cálculo de troco\n[3]Sair");
            opc = scanner.nextInt();

            switch(opc)
            {
                case 1:
                System.out.println("Qual a quantidade de plantas?");
                int quant = scanner.nextInt();

                System.out.println("Qual o valor da espécie de planta escolhida?");
                int prec = scanner.nextInt();

                int valtot = (quant*prec);
                System.out.println("O valor da compra ficou: " + valtot);
                break;

                case 2:
                System.out.println("Quanto será pago pelo cliente?");
                int pag = scanner.nextInt();
                System.out.println("Qual o total do compra?");
                int valtot2 = scanner.nextInt();
                float troco = (pag-valtot2);
                if (troco>=0)
                {
                    System.out.println("O troco é:" + troco);
                }
                else
                {
                    System.out.println("O pagamento não é suficiente para a compra");
                }
                break;

                case 3:
                System.out.print("Operação encerrada");
                scanner.close();
                break;
                
                default:
                System.out.print("Opção inválida");
                break;
            }
        } while (opc!=3);
        
    }
}
