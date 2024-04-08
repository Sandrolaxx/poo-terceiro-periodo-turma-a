package atividades;
import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int valorPago = 0;
        int totalPlantas = 0;

        System.out.println("Do total de plantas vendidas para esse cliente, quantas espécies diferentes foram vendidas?");
        int especies = scanner.nextInt();     
        System.out.println("--------------------------------------------");
                    
        double precoTotal = 0;
        double[][] vendas = new double[especies][3];
        double[][][] vendasMensais = new double[12][30][2];

        for(int i = 0; i < especies; i++){
            int precoEspecie = 0;
            int plantasVendidas = 0;
            
            if(especies == 1){
                System.out.println("\nQuantas plantas dessa espécie foram vendidas?");
            } else {
                System.out.println("\nQuantas plantas da "+ (i+1) + "º espécie foram vendidas?");
            }
            plantasVendidas = scanner.nextInt();
            while(plantasVendidas <= 0){
                System.out.println("\nINSIRA UM VALOR POSITIVO!");
                plantasVendidas = scanner.nextInt();
            }

            System.out.println("\nQual é o preço de uma planta dessa espécie?");
            int precoPlanta = scanner.nextInt();
            while(precoPlanta <= 0){
                System.out.println("\nINSIRA UM VALOR POSITIVO!");
                precoPlanta = scanner.nextInt();
            }

            totalPlantas += plantasVendidas;
            precoEspecie = plantasVendidas * precoPlanta;
            precoTotal += precoEspecie;

            vendas[i][0] = plantasVendidas;
            vendas[i][1] = precoEspecie;
            
            System.out.println("--------------------------------------------");
        }

        System.out.println("\nEm qual mês essa compra vai ser salva?");
        int mes = scanner.nextInt(); 

        System.out.println("\nEm qual dia do mês essa compra vai ser salva?");
        int dia = scanner.nextInt(); 

        for(int i = 0; i < especies; i++) {
            vendasMensais[mes - 1][dia - 1][0] += vendas[i][0];
            vendasMensais[mes - 1][dia - 1][1] += vendas[i][1];
        }

        double desconto = 0;

        if(totalPlantas > 10){
            desconto = precoTotal * 0.05;
            precoTotal = precoTotal - desconto;
        }

        System.out.println("\nQual foi o valor pago pelo cliente?");
        valorPago = scanner.nextInt();
        while(valorPago <= 0){
            System.out.println("\nINSIRA UM VALOR POSITIVO!");
            valorPago = scanner.nextInt();
            System.out.println("--------------------------------------------");
        }

        while(true){

            System.out.println("\n|MENU:\n|[1] Preço total\n|[2] Valor do troco devido\n|[3] Registro de vendas\n|[4] Buscar vendas por mês e dia\n|[5] Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nO preço total da compra é de R$: " + precoTotal);
                    break;

                case 2:
                    if(valorPago < precoTotal){
                        System.out.println("\nÉ calote");
                    }
                    else{
                        System.out.println("\nO troco devido é de R$: " + (valorPago - precoTotal));
                    }
                    break;
                
                case 3:
                    System.out.println("\nRegistro de vendas:");
                    for (int i = 0; i < especies; i++){
                        System.out.println("\nEspécie " + (i+1) + ": Quantidade: " + vendas[i][0] + ", Preço total: " + vendas[i][1] + ", Desconto: " + vendas[i][2]);
                    }
                    break;
                
                case 4:
                    System.out.println("\nBuscar vendas por mês e dia:");
                    System.out.println("\nQual mês? ");
                    int achadorMes = scanner.nextInt();
                    System.out.println("\nDigite o dia do mês: ");
                    int achadorDia = scanner.nextInt();
                    double achadorVendas = vendasMensais[achadorMes - 1][achadorDia - 1][1];
                    System.out.println("\nO preço total de vendas para o dia " + achadorDia + " do mês " + achadorMes + " foi de R$: " + achadorVendas);
                    break;

                case 5:
                    System.out.println("\nSAINDO DO PROGRAMA");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("\nOPÇÃO INVÁLIDA!");
                    break;
            }
            
            System.out.println("--------------------------------------------");
        }  
             
    }
}
