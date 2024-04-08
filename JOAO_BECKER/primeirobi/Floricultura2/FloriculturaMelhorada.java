package primeirobi.Floricultura2;
import java.util.Scanner;
public class FloriculturaMelhorada {
    public static void main(String[] args){
        try (Scanner leitor = new Scanner(System.in)) {
            boolean loja=false;
            int contador=0;
            float[] plantasVendidas = new float[20];
            float[] valorVenda = new float[20];
            while (loja==false) {
                System.out.println("[1] - Calcular Preço Total \n[2] - Calcular Troco\n[3] - Registro De Vendas\n[4] - Sair ");
                short verificar;
                verificar = leitor.nextShort();
                System.out.println("-----------------------------------------------\n");
                switch (verificar) {
                    case 1:
                        float valorUnitario=0;
                        float unidade=0;
                        float valorTotal=0;
                        System.out.println("Insira quantidade de plantas:");
                        unidade = leitor.nextFloat();
                        System.out.println("Insira valor da unidade da planta:");
                        valorUnitario = leitor.nextFloat();
                        if(unidade<=10){
                            valorTotal=unidade*valorUnitario;
                        }else{
                            valorTotal=(unidade*valorUnitario)*0.95f;
                        }
                        System.out.println("Preço total: R$"+valorTotal);
                        System.out.println("-----------------------------------------------\n");
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
                        System.out.println("-----------------------------------------------\n");
                        break;
                    case 3:
                        int desconto=0;
                        System.out.println("Insira quantidade de plantas vendidas:");
                        plantasVendidas[contador] = leitor.nextFloat();
                        System.out.println("Insira o valor da venda:");
                        valorVenda[contador] = leitor.nextFloat();
                        System.out.println("O desconto foi aplicado 1 para sim 0 para nao");
                        desconto = leitor.nextInt();
                        System.out.println("\n");
                        contador++;
                        for(int i=0;i<contador;i++){
                            System.out.println("Planta["+(i+1)+"]");
                            System.out.println("Quantidade de plantas vendidas:"+plantasVendidas[i]+"");
                            System.out.println("Valor da venda:"+valorVenda[i]+"");
                            if(desconto==1){
                                System.out.println("O desconto de 5% foi aplicado");
                            }else{
                                System.out.println("O desconto não foi aplicado:");
                            }
                            System.out.println("\n");
                        }
                        System.out.println("-----------------------------------------------\n");
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