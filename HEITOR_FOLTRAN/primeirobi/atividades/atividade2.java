package atividades;
import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int valorPago = 0;
        int totalPlantas = 0;

        System.out.println("Do total de plantas vendidas para esse cliente, quantas espécies diferentes foram vendidas?");
        int especies = scanner.nextInt();     
        System.out.println("--------------------------------------------");
                    
        double precoTotal = 0;
        double[][] vendas = new double[especies][3]; // <------------ matriz pro registro de vendas

        for(int i = 0; i < especies; i++){
            int precoEspecie = 0;
            
            if(especies == 1){
                System.out.println("\nQuantas plantas dessa espécie foram vendidas?");
            }else{
                System.out.println("\nQuantas plantas da "+ (i+1) + "º espécie foram vendidas?");
            }
            int plantasVendidas = scanner.nextInt();
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

        double desconto = 0;

        if(totalPlantas > 10){ // <-------------------- calcula o desconto que vai ser aplicado no preço total
            desconto = precoTotal * 0.05;
            precoTotal = precoTotal - desconto;
            
            for (int i = 0; i < especies; i++) {
                vendas[i][2] = vendas[i][1] * 0.05; // <--------------------calcula o desconto individual de cada epécie (desnecessário e legal)
            }
        }

        System.out.println("\nQual foi o valor pago pelo cliente?");
        valorPago = scanner.nextInt();
        while(valorPago <= 0){
            System.out.println("\nINSIRA UM VALOR POSITIVO!");
            valorPago = scanner.nextInt();
            System.out.println("--------------------------------------------");
        }

        while(true){

            System.out.println("\n|MENU:\n|[1] Preço total\n|[2] Valor do troco devido\n|[3] Registro de vendas\n|[4] Sair");
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
                            System.out.println("\n|Espécie " + (i+1) + "- Quantidade: " + vendas[i][0] + ", Preço total: " + vendas[i][1] + ", Valor do desconto: " + vendas[i][2] + "|");
                    }
                    break;

                case 4:
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
