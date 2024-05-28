package primeirobi.Exercicio3;

import java.util.Scanner;

public class Floricultura3 {
       public static void main(String[] args){
        try (Scanner leitor = new Scanner(System.in)) {
            boolean loja=false;
            float [][] vendasMes = new float [13][32];
            while (loja==false) {
                System.out.println("[1] - Calcular Preço Total \n[2] - Calcular Troco\n[3] - Registro De Vendas\n[4] - Sair ");
                short verificar;
                verificar = leitor.nextShort();
                System.out.println("-----------------------------------------------");
                switch (verificar) {
                    case 1:
                        float valorUnitario=0;
                        int unidade=0;
                        int dia=0;
                        int mes=0;
                        boolean testeMes=false;
                        float valorTotal=0;
                        while(testeMes==false){
                        System.out.println("Mês (em numeros):");
                        mes = leitor.nextInt();
                        System.out.println("Dia do mes:");
                        dia = leitor.nextInt();
                        if((mes==2 && dia>=29)||((mes%2 == 0 && mes<8) && dia>30)||(mes>12 || dia>31)||((mes%2 != 0 && mes>7) && dia>30)||(mes==0 || dia==0)){
                            System.out.println("data invalida tente novamente");
                            testeMes=false;
                        }else{
                            testeMes=true;
                        }
                        }
                        System.out.println("Insira quantidade de plantas:");
                        unidade = leitor.nextInt();
                        System.out.println("Insira valor da unidade da planta:");
                        valorUnitario = leitor.nextFloat();
                        if(unidade<=10){
                            valorTotal=unidade*valorUnitario;
                        }else{
                            valorTotal=(unidade*valorUnitario)*0.95f;
                        }
                        System.out.println("Preço total: R$"+valorTotal);
                        vendasMes[mes][dia]+=valorTotal;
                        System.out.println("-----------------------------------------------");
                        break;
                    case 2:
                        float valorRecebido=0;
                        float valorTotalCompra=0;
                        float troco=0;
                        System.out.println("Insira valor recebido pelo cliente:");
                        valorRecebido = leitor.nextFloat();
                        System.out.println("Insira valor total da compra:");
                        valorTotalCompra = leitor.nextFloat();
                        troco=valorRecebido-valorTotalCompra;
                        if(troco>=0){
                            System.out.println("Valor do troco: R$"+troco);
                        }else{
                            System.out.println("O cliente necessita de mais R$"+troco*-1+" para realizar a compra.");
                        }
                        System.out.println("-----------------------------------------------");
                        break;
                    case 3:
                        testeMes=false;
                        mes=0;
                        dia=0;
                        while(testeMes==false){
                            System.out.println("\nInsira mês para vizualizar vendas:");
                            mes= leitor.nextInt();
                            System.out.println("\nInsira dia do mês para vizualizar vendas:");
                            dia= leitor.nextInt();
                            if((mes==2 && dia>=29)||((mes%2 == 0 && mes<8) && dia>30)||(mes>12 || dia>31)||((mes%2 != 0 && mes>7) && dia>30)||(mes==0 || dia==0)){
                                System.out.println("data invalida tente novamente");
                                testeMes=false;
                            }else{
                                testeMes=true;
                            }
                        }
                        System.out.println("\nO valor de vendas do mês "+mes+"  no dia "+dia+" foi de: R$"+vendasMes[mes][dia]+"\n");
                        System.out.println("-----------------------------------------------");
                        break;
                    case 4:
                        loja = true;
                        break;
                    default:
                        System.out.println("Opção invalida tente novamente.");
                        break;
                }
            }
        }
    }
}
