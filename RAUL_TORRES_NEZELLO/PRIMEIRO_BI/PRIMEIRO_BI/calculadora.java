package PRIMEIRO_BI;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int maisproduto;
            int[][] matriz= new int[11][29];
            int[] vetortotal  = new int[100];
            double[] vetordesconto  = new double[100];
            int[] vetorquantidade  = new int[100];
            double[][] matrizdata = new double[12][30];
            int contador=0;
            double totdia = 0;
            int mes;
            int dia;
            do {
                System.out.println("Quantidade da planta:");
                int qnt = scanner.nextInt();
    
                System.out.println("Valor da planta:");
                double val = scanner.nextDouble();
                
                double tot = val * qnt;
                if(qnt>10){
                    double desconto = 0.05 * (double) tot;
                    tot =  (tot - desconto);
                    vetordesconto [contador] = desconto;
                }
                totdia = totdia + tot;
                vetortotal [contador] = tot;
                vetorquantidade [contador] = qnt;

                System.out.println("Valor recebido:");
                double receba = scanner.nextDouble();
    
                int verifi = 0;
                contador++;
                while(verifi == 0){
                System.out.println("\nMenu\n [1]Preço total\n [2]Troco\n [3]Registro de vendas\n [4]Salvar quantidade total de venda\n [5]Sair");
                int menu = scanner.nextInt();
                switch (menu) {
                    case 1:
                    System.out.println("Preço total: "+tot);
                        break;
                    case 2:
                    if(tot<receba){
                        System.out.println("Troco a ser dado: "+(receba - tot));
                        }
                        if(receba<tot){
                            System.out.println("Valor faltando:"+(tot - receba));
                        }
                        if(receba==tot){
                            System.out.println("Nenhum desconto a ser dado");
                        }
                        break;
                    case 3:
                    for(int i=0;i<contador;i++){
                       int n=i+ 1; 
                        System.out.println("\nCompra "+n+":\nValor total: "+vetortotal[i]+ "\nQuantidade comprada: "+vetorquantidade[i]+"\nDesconto aplicado: "+vetordesconto[i]);
                
                    }
                        break;
                    case 4:
                    System.out.println("Digite o mes que deseja salvar:");
                    mes = scanner.nextInt();
                    System.out.println("Digite o dia que deseja salvar:");
                    dia = scanner.nextInt();
                    matrizdata[mes][dia] = totdia;
                        break;
                    case 5:
                    System.out.println("Digite o mes que deseja buscar:");
                    mes = scanner.nextInt();
                    System.out.println("Digite o dia que deseja buscar:");
                    dia = scanner.nextInt();
                    System.out.println("Valor total do dia "+dia+" mes "+mes+" = "+matrizdata[mes][dia]);
                        break;
                    case 6:
                    verifi = 1;
                        break;
                    default:
                    System.out.println("Numero invalido");
                        break;
                }
         }
         System.out.println("Deseja adicionar mais um produto?\n[1]Sim\n[2]Nao");
         maisproduto = scanner.nextInt();
            } while (maisproduto==1);
        }
    }
}
