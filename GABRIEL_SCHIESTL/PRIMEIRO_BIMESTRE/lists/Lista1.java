package PRIMEIRO_BIMESTRE.lists;

import java.util.Scanner;

public class Lista1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas plantas o cliente comprou? ");
        int qttBought = sc.nextInt();
        String[] plants = new String[qttBought];
        float[] price = new float[qttBought];
        for(int i = 0; i < qttBought; i++){
            System.out.println("Qual o nome da planta " + (i+1) + "?");
            plants[i] = sc.next();
           System.out.println("Qual o preço da " + plants[i] + "?");
           price[i] = sc.nextFloat();
        }
        int choosenOption = 0;
        while(choosenOption != 3){
        System.out.println("Digite o número da opção que desejas: \n[1] - Calcular Preço Total\n[2] - Calcular Troco\n[3] - Sair");
        choosenOption = sc.nextInt();
        switch (choosenOption) {
            case 1:
                String queryName = "";
                float queryResult = 0f;
                if(qttBought != 1){
                System.out.println("Qual planta você deseja ver o total vendido? ");
                queryName = sc.next();
                for(int x = 0; x < plants.length; x++){
                    if (queryName.equals(plants[x])) {
                        queryResult = price[x];
                        break;
                    } 
                }
            } else {
                queryResult = price[0];
                queryName = plants[0];
            }
                float qttSold;
                System.out.println("Qual foi a quantidade vendida de " + queryName);
                qttSold = sc.nextInt();
                float finalPrice = qttSold * queryResult;
                String format = finalPrice == 1.0f ? "real" : "reais";
                System.out.println("O valor final vendido desta planta foi de: " + finalPrice + " " + format);
                break;
        
            case 2:
                float payment = 0f;
                float totale = 0f;
                System.out.println("Qual foi o valor total da compra? ");
                totale = sc.nextFloat();
                System.out.println("Qual foi o valor pago pelo cliente? ");
                payment = sc.nextFloat();
                if(payment >= totale){
                    float troco = payment - totale;
                    String formatTroco = troco == 1.0f ? "real" : "reais";
                    System.out.println("Troco: " + troco + " " + formatTroco);
                } else {
                    System.out.println("Valor pago menor que o valor total da compra");
                }
                break;
            default:
            System.out.println("Saindo do sistema...");
            break;
        }
    }
    }
};
